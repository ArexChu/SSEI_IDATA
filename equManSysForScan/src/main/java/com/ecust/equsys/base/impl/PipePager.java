package com.ecust.equsys.base.impl;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import com.ecust.equsys.MainUI;
import com.ecust.equsys.R;
import com.ecust.equsys.base.BasePager;
import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.impl.pipedetail.PipeConfigPager;
import com.ecust.equsys.base.impl.pipedetail.PipeInstallPager;
import com.ecust.equsys.base.impl.pipedetail.PipeMonthlyCheckPager;
import com.ecust.equsys.base.impl.pipedetail.PipeOnlineCheckPager;
import com.ecust.equsys.base.impl.pipedetail.PipeOverallCheckPager;
import com.ecust.equsys.base.impl.pipedetail.PipeInfoPager;
import com.ecust.equsys.base.impl.pipedetail.PipeTagLoadPager;
import com.ecust.equsys.fragment.LeftMenuFragment;
import java.util.ArrayList;
import java.util.List;

public class PipePager extends BasePager{
	public static final String TAG = PipePager.class.getSimpleName();

	public List<String> pipeLeftMenuList;

	public List<MenuDetailBasePager>  pipePagerList;

	int title = R.string.content_pipe;//标志该页面是管道
	String[] item = {"管道信息加载","基本信息","配置信息","管道安装","全面检验","在线检验","月度检验"};

	public PipePager(Activity activity) {
		super(activity);
	}

	@Override
	public void initData() {
		tvTitle.setText(R.string.content_pipe);
		ibMenu.setVisibility(View.VISIBLE);

		pipeLeftMenuList=new ArrayList<String>();
		for (int i = 0; i < item.length; i++) {
			pipeLeftMenuList.add(item[i]);
		}

		processData();

	}

	private void processData() {

		// 初始化左侧菜单对应的页面
		pipePagerList= new ArrayList<MenuDetailBasePager>();
		pipePagerList.add(new PipeTagLoadPager(mActivity));
		pipePagerList.add(new PipeInfoPager(mActivity));
		pipePagerList.add(new PipeConfigPager(mActivity));
		pipePagerList.add(new PipeInstallPager(mActivity));
		pipePagerList.add(new PipeOverallCheckPager(mActivity));
		pipePagerList.add(new PipeOnlineCheckPager(mActivity));
		pipePagerList.add(new PipeMonthlyCheckPager(mActivity));

		// 把左侧菜单数据传递给LeftMenuFragment来处理
		MainUI mainUI = ((MainUI) mActivity);
		LeftMenuFragment leftMenuFragment = mainUI.getLeftMenuFragment();
		leftMenuFragment.setMenuDataList(pipeLeftMenuList,title);
	}

	/**
	 * 根据索引切换当前的页面
	 * @param position
	 */
	public void switchCurrentPager(int position) {
		String title  = item[position];
		Log.v(TAG, "position:" +position);
		tvTitle.setText(title);

		MenuDetailBasePager pager = pipePagerList.get(position);
		Log.v(TAG, "pager:" +pager);
		flContent.removeAllViews(); // 清除所有的子布局
		flContent.addView(pager.rootView);
        pager.initData();
    }
}
