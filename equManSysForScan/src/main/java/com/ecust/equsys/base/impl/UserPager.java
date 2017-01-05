package com.ecust.equsys.base.impl;

import android.app.Activity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.ecust.equsys.R;
import com.ecust.equsys.base.BasePager;
import com.ecust.equsys.utils.RFIDReader;
import com.ecust.equsys.utils.CacheUtils;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.pow.api.cls.RfidPower;
import com.uhf.api.cls.Reader;

public class UserPager extends BasePager{

	public UserPager(Activity activity) {
		super(activity);
	}
	public static final String USERNAME = "userName";
	public static final String PASSWORD = "password";
	public static final String SAVEPASSWORD = "savePassword";

	//传入平台
	public RfidPower Rpower;
	public Reader Mreader;

	@ViewInject(R.id.login_edit_account)
	private EditText et_userName;//用户名
	
	@ViewInject(R.id.login_edit_pwd)
	private EditText et_password;//密码
	
	@ViewInject(R.id.login_btn_login)
	private Button loginButton;//提交按钮
	
	@ViewInject(R.id.login_cb_savepwd)
	private CheckBox savedBox;//是否保存密码

	@ViewInject(R.id.button_connect)
	private Button button_connect;//连接

	@ViewInject(R.id.button_disconnect)
	private Button button_disconnect;//断开
	
	@Override
	public void initData() {
		tvTitle.setText(R.string.content_user);
		ibMenu.setVisibility(View.GONE);
		
		View view = View.inflate(mActivity, R.layout.user_login,null);		
		ViewUtils.inject(this,view);

		//传入平台类型
		Rpower = RFIDReader.getRfidPower();
		Mreader = RFIDReader.getReader();
		//连接监听
		button_connect.setOnClickListener(new UserPager.ConnectClickListener());
		//断开监听
		button_disconnect.setOnClickListener(new UserPager.DisconnectClickListener());

		/**
		 * 1：从SharedPreferences中取出用户名，如果不为空，为用户名赋初值
		 * 2：从SharedPreferences中取出密码，如果不为空，为密码赋初值
		 * * 2：从SharedPreferences中取出是否保存
		 * 3：为提交按钮添加点击事件：（1）保存用户名 （2）保存密码 （3）保存是否需要保存密码
		 */
		String userName = CacheUtils.getString(mActivity, USERNAME, "0");
		String passWord = CacheUtils.getString(mActivity, PASSWORD, "0");
		Boolean savePass = CacheUtils.getBoolean(mActivity, SAVEPASSWORD, false);
		if (!userName.equals("0")) {
			et_userName.setText(userName);
		}
		if (!passWord.equals("0")) {
			et_password.setText(passWord);
		}
		savedBox.setChecked(savePass);
		loginButton.setOnClickListener(new LoginClickListener());
		
		flContent.addView(view);
	}
	
	private class LoginClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			//禁用按钮的点击事件，以免多次点击
			loginButton.setClickable(false);
			if (et_userName.length()==0||et_password.length()==0) {
				Toast.makeText(mActivity, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
			}
			else {
				//记录各种的状态
				CacheUtils.putString(mActivity, USERNAME, et_userName.getText().toString());
				CacheUtils.putString(mActivity, PASSWORD, et_password.getText().toString());
				CacheUtils.putBoolean(mActivity, SAVEPASSWORD, savedBox.isChecked());
				Toast.makeText(mActivity, "提交成功", Toast.LENGTH_SHORT).show();	
			}
			//重新启用按钮
			loginButton.setClickable(true);
	
		}
		
	}

	//窗体事件
	class ConnectClickListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			// PDATYPE pt=myapp.Rpower.GetType();
			String  ip = Rpower.GetDevPath();
			boolean blen = Rpower.PowerUp();

					    /* try {
							FileWriter localFileWriterOn = new FileWriter(new File("/proc/gpiocontrol/set_id"));
					    	localFileWriterOn.write("1");
					    	localFileWriterOn.close();
					    } catch (Exception e) {
					    	e.printStackTrace();
					    }
					    */

			Toast.makeText(mActivity, "连接读写器，上电",
					Toast.LENGTH_SHORT).show();
			if (!blen)
				return;

			Reader.READER_ERR er = Mreader.InitReader_Notype(ip, 1);
			//READER_ERR er=myapp.Mreader.InitReader(ip, Reader_Type.MODULE_ONE_ANT);
			if (er == Reader.READER_ERR.MT_OK_ERR) {
				Toast.makeText(mActivity, "连接成功",
						Toast.LENGTH_SHORT).show();
				button_connect.setClickable(false);
			} else
				Toast.makeText(mActivity, "连接失败:" +
						er.toString(), Toast.LENGTH_SHORT).show();
		}
	}

	class DisconnectClickListener implements OnClickListener {

		@Override
		public void onClick(View arg0) {
			if (Mreader != null)
				Mreader.CloseReader();

			boolean blen = Rpower.PowerDown();
						/*try {
							FileWriter localFileWriterOff = new FileWriter(new File("/proc/gpiocontrol/set_id"));
							localFileWriterOff.write("0");
							localFileWriterOff.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
						 */
			Toast.makeText(mActivity, "断开读写器，下电",
					Toast.LENGTH_SHORT).show();
			button_connect.setClickable(true);
		}

	}
	
}
