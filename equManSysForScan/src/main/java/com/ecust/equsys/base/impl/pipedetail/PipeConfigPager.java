package com.ecust.equsys.base.impl.pipedetail;

import android.app.Activity;
import android.view.View;

import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.MenuDetailUI;
import com.ecust.equsys.base.impl.pipedetail.data.PipeConfigData;
import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.PipeConfig;

public class PipeConfigPager extends MenuDetailBasePager{

	public PipeConfigPager(Activity activity) {
		super(activity);
	}
	private MenuDetailUI pager;

	@Override
	public View initView() {

		pager = new MenuDetailUI(mActivity);
		//pager.initData(); // 加载数据
		return pager.rootView;

	}

	@Override
	public void initData() {
		super.initData();
		pager.mDomain= PipeConfigData.getPipeConfig();
		pager.initData();
	}
}
