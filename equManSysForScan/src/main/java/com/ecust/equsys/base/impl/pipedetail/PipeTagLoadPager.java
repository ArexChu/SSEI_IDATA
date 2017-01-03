package com.ecust.equsys.base.impl.pipedetail;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ecust.equsys.R;
import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.utils.CacheUtils;
import com.ecust.equsys.utils.DbHelper;
import com.ecust.equsys.utils.HttpHelper;
import com.ecust.equsys.utils.RFIDReader;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.pow.api.cls.RfidPower;
import com.uhf.api.cls.Reader;

import java.util.Arrays;

public class PipeTagLoadPager extends MenuDetailBasePager{

	private static final String TAG = PipeTagLoadPager.class.getSimpleName();

	public PipeTagLoadPager(Activity activity) {
		super(activity);
	}
	public static final String PIPE_TAG_ID = "pipe_tag_id" ;
	public static final String PIPE_MISSION_ID = "pipe_mission_id" ;

	private DbHelper mDbHelper;

	private String pipeID;//管道号
	
	private String missionID;//任务号

	//传入平台
	public RfidPower Rpower;
	public Reader Mreader;

	@ViewInject(R.id.et_tag_load_equ_id)
	private EditText et_tagID;//标签号
	
	@ViewInject(R.id.et_mission_load_man_id)
	private EditText et_missionID;//业务号

	@ViewInject(R.id.bt_tag_read_equ_id)
	private Button button_readop;//读取按钮

	@ViewInject(R.id.bt_tag_write_equ_id)
	private Button button_writeop;//写入按钮

	@ViewInject(R.id.bt_tag_download_Info)
	private Button loadTagInfo;//从网络加载数据

	@ViewInject(R.id.bt_tag_load_equ_id)
	private Button saveTagButton;//提交按钮
	
	@ViewInject(R.id.bt_mission_load_man_id)
	private Button loadMissionButton;//提交按钮


	@Override
	public View initView() {
		View view = View.inflate(mActivity, R.layout.load_pipe_tag_info, null);
		ViewUtils.inject(this,view);
		return view;
	}
	
	@Override
	public void initData() {
		mDbHelper = DbHelper.getInstance(mActivity);

		//传入平台类型
		Rpower = RFIDReader.getRfidPower();
		Mreader = RFIDReader.getReader();

		//为读取按钮添加按键监听
		button_readop.setOnClickListener(new ReadClickListener());
		//为写入按钮添加按键监听
		button_writeop.setOnClickListener(new WriteClickListener());

		//先判断该标签是否已经保存，如果有值，将其显示
		boolean isSaved = judgeIsSavedTagID();
		if (isSaved) {
			et_tagID.setText(pipeID);
		}

		//判断是否输入业务号，如果有，将其显示
		boolean isInputMissionID = judgeisInputMissionID();
		if (isInputMissionID) {
			et_missionID.setText(missionID);
		}
		//为从网络获取数据添加监听事件
		loadTagInfo.setOnClickListener(new LoadInfoFromInternet());

		//为提交按钮添加按键监听
		saveTagButton.setOnClickListener(new TagSubmitClickListener());
		//为提交按钮添加按键监听
		loadMissionButton.setOnClickListener(new MissionSubmitClickListener());
	}

	//判断是否输入标签号
	private boolean judgeIsSavedTagID() {
		pipeID = CacheUtils.getString(mActivity, PIPE_TAG_ID, null);
		return !(pipeID == null);
	}

	/**
	 * 判断是否输入业务号
	 * @return
	 */
	private boolean judgeisInputMissionID() {
		//从内存中取值，如果有值，则说明之前存过。
		missionID = CacheUtils.getString(mActivity, PIPE_MISSION_ID, null);
		if (missionID == null) {
			return false;
		}
		return true;
	}

	//从网络获取数据按钮的监听事件
	class LoadInfoFromInternet implements OnClickListener{

		@Override
		public void onClick(View v) {
			pipeID = et_tagID.getText().toString();
			if (pipeID == null) {
				Toast.makeText(mActivity, "请先读取或提交标签信息！", Toast.LENGTH_SHORT).show();
			}
			else {
				HttpHelper httpHelper = new HttpHelper(mActivity);
				httpHelper.loadPipeBasicInfo(pipeID);
				CacheUtils.putString(mActivity, PIPE_TAG_ID, pipeID);
			}
		}
	}

	//提交按钮的监听事件
	class TagSubmitClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			pipeID = et_tagID.getText().toString();
			if (pipeID == null) {
				Toast.makeText(mActivity, "请先读取标签或手工填写标签信息", Toast.LENGTH_SHORT).show();
			}
			CacheUtils.putString(mActivity, PIPE_TAG_ID, pipeID);
			Toast.makeText(mActivity, "标签信息提交成功", Toast.LENGTH_SHORT).show();
		}
	}

	/**
	 * 提交按钮的监听事件
	 * @author smxiang
	 *
	 */
	class MissionSubmitClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			String missionString = et_missionID.getText().toString();
			if (missionString == null) {
				Toast.makeText(mActivity, "业务号不能为空！", Toast.LENGTH_SHORT).show();
			}
			else {
				CacheUtils.putString(mActivity, PIPE_MISSION_ID, missionString);
				et_missionID.setText(missionString);
				Toast.makeText(mActivity, "业务号提交成功", Toast.LENGTH_SHORT).show();
			}			
		}
	}

	//读取标签信息监听
	class ReadClickListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			try {
				int rDataSize = 0;
				int rBlockSize = 0;

				byte[] rpaswd = new byte[4];

				byte[] rsizebyte = new byte[2];
				Reader.READER_ERR er= Reader.READER_ERR.MT_OK_ERR;
				int trycount = 3;
				do{
					er = Mreader.GetTagData(1,
							(char)3,
							0,
							1,
							rsizebyte,rpaswd,(short)1000);

					trycount--;
					if(trycount<1)
						break;
				}while(er != Reader.READER_ERR.MT_OK_ERR);

				if(er == Reader.READER_ERR.MT_OK_ERR) {
					rDataSize = (rsizebyte[0] << 8) & 0xff00 | (rsizebyte[1]) & 0x00ff;
					int rAddSize = rDataSize;
					//Log.v(TAG, "rDataSize：" + rDataSize);
					if ((rAddSize % 2) != 0) {
						rAddSize += 1;
						rBlockSize = rAddSize / 2;
					} else {
						rBlockSize = rAddSize / 2;
					}
					//Log.v(TAG, "rBlockSize：" + rBlockSize);
				}

				byte[] rdata = new byte[rBlockSize*2];
				do{
					er = Mreader.GetTagData(1,
							(char)3,
							1,
							rBlockSize + 1,
							rdata,rpaswd,(short)1000);

					trycount--;
					if(trycount<1)
						break;
				}while(er != Reader.READER_ERR.MT_OK_ERR);

				if(er == Reader.READER_ERR.MT_OK_ERR)
				{
					//Log.v(TAG, "rdata：" + Arrays.toString(rdata));
					String val="";
					val=new String(rdata,"gbk");
					//Log.v(TAG, "val:" + val);
					if ((rDataSize % 2) != 0) {
						val = val.substring(0, rDataSize);
					}
					//读取标签内容
					et_tagID.setText(val);
					CacheUtils.putString(mActivity, PIPE_TAG_ID, val);

					Toast.makeText(mActivity, "读取标签成功",
							Toast.LENGTH_SHORT).show();
				}
				else
					Toast.makeText(mActivity, "失败",
							Toast.LENGTH_SHORT).show();


			} catch (Exception e) {
				Toast.makeText(mActivity, "异常",
						Toast.LENGTH_SHORT).show();
			}

		}

	}

	//写入标签信息监听
	class WriteClickListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			pipeID = et_tagID.getText().toString();
			if (pipeID == null) {
				Toast.makeText(mActivity, "请填写标签写入信息", Toast.LENGTH_SHORT).show();
			} else {
				CacheUtils.putString(mActivity, PIPE_TAG_ID, pipeID);
			}
			try {
				byte[] wdata = null;
				byte[] wsize = new byte[2];
				wsize[0] = (byte) (pipeID.length() >> 8);
				wsize[1] = (byte) (pipeID.length());
				//Log.v(TAG, "wsize：" + Arrays.toString(wsize));

				byte[] rpaswd = new byte[4];

				Reader.READER_ERR er = Reader.READER_ERR.MT_OK_ERR;
				int trycount = 3;
				do {
					er = Mreader.WriteTagData(1,
							(char) 3,
							0,
							wsize, wsize.length, rpaswd,
							(short) 1000);
					trycount--;
					if (trycount < 1)
						break;
				} while (er != Reader.READER_ERR.MT_OK_ERR);

				if (er == Reader.READER_ERR.MT_OK_ERR) {
					if ((pipeID.length() % 2) != 0) {
						pipeID += "0";
					}
					wdata = pipeID.getBytes("gbk");
					//Log.v(TAG, "wdata：" + Arrays.toString(wdata));
				} else
					Toast.makeText(mActivity, "失败",
							Toast.LENGTH_SHORT).show();

				do {
					er = Mreader.WriteTagData(1,
							(char) 3,
							1,
							wdata, wdata.length, rpaswd,
							(short) 1000);
					trycount--;
					if (trycount < 1)
						break;
				} while (er != Reader.READER_ERR.MT_OK_ERR);


				if (er == Reader.READER_ERR.MT_OK_ERR) {
					Toast.makeText(mActivity, "写入标签成功",
							Toast.LENGTH_SHORT).show();
				} else
					Toast.makeText(mActivity, "失败",
							Toast.LENGTH_SHORT).show();

			} catch (Exception e) {
				Toast.makeText(mActivity, "异常",
						Toast.LENGTH_SHORT).show();
			}
		}

	}

}
