package com.ecust.equsys.base.impl.vesseldetail;

import android.app.Activity;
import android.view.View;

import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.MenuDetailUI;
import com.ecust.equsys.base.impl.vesseldetail.data.VesselConfigData;

public class VesselConfigPager extends MenuDetailBasePager{

	public VesselConfigPager(Activity activity) {
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
		pager.mDomain= VesselConfigData.getVesselConfig();
		pager.initData();
	}

}
