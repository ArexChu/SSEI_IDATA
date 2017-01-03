package com.ecust.equsys.base.impl.pipedetail;

import android.app.Activity;
import android.view.View;

import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.MenuDetailUI;
import com.ecust.equsys.base.impl.pipedetail.data.PipeInfoData;
import com.ecust.equsys.base.impl.pipedetail.data.PipeOverallCheckData;
import com.ecust.equsys.domain.MenuDetailUIDomain;
import com.ecust.equsys.domain.pipe.PipeInfo;

import java.util.HashMap;
import java.util.Map;

public class PipeInfoPager extends MenuDetailBasePager{

	public PipeInfoPager(Activity activity) {
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
		pager.mDomain= PipeInfoData.getPipeInfo();
		pager.initData();

	}
}
