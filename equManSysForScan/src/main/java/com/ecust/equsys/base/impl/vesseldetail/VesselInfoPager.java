package com.ecust.equsys.base.impl.vesseldetail;

import android.app.Activity;
import android.view.View;

import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.MenuDetailUI;
import com.ecust.equsys.base.impl.vesseldetail.data.VesselInfoData;
import com.ecust.equsys.domain.MenuDetailUIDomain;

public class VesselInfoPager extends MenuDetailBasePager{

	private MenuDetailUI pager;

	public VesselInfoPager(Activity activity) {
		super(activity);
	}

	@Override
	public View initView() {

		pager = new MenuDetailUI(mActivity);
		//pager.initData(); // 加载数据
		return pager.rootView;

	}

	@Override
	public void initData() {
		super.initData();
		pager.mDomain= VesselInfoData.getVesselInfo();
		pager.initData();
		//System.out.println("初始化基本信息");
	}

}
