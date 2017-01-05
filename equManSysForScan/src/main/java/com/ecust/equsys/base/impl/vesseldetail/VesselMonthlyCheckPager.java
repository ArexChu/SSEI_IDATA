package com.ecust.equsys.base.impl.vesseldetail;

import android.app.Activity;
import android.view.View;

import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.MenuDetailUI;
import com.ecust.equsys.base.impl.vesseldetail.data.VesselMonthlyCheckData;

public class VesselMonthlyCheckPager extends MenuDetailBasePager{

	public VesselMonthlyCheckPager(Activity activity) {
		super(activity);
	}
	private MenuDetailUI pager;

	@Override
	public View initView() {
		pager = new MenuDetailUI(mActivity);
		return pager.rootView;

	}

	@Override
	public void initData() {
		super.initData();
		pager.mDomain= VesselMonthlyCheckData.getVesselMonthlyCheck();
		pager.initData();

	}
}
