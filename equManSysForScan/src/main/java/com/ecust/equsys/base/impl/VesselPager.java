package com.ecust.equsys.base.impl;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.view.View;
import com.ecust.equsys.MainUI;
import com.ecust.equsys.R;
import com.ecust.equsys.base.BasePager;
import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.impl.vesseldetail.VesselConfigPager;
import com.ecust.equsys.base.impl.vesseldetail.VesselCheckPager;
import com.ecust.equsys.base.impl.vesseldetail.VesselAnnualPager;
import com.ecust.equsys.base.impl.vesseldetail.VesselMonthlyCheckPager;
import com.ecust.equsys.base.impl.vesseldetail.VesselPeriodicPager;
import com.ecust.equsys.base.impl.vesseldetail.VesselInfoPager;
import com.ecust.equsys.base.impl.vesseldetail.VesselTagLoadPager;
import com.ecust.equsys.fragment.LeftMenuFragment;

public class VesselPager extends BasePager{
	public List<String> containerLeftMenuList;
	
	public List<MenuDetailBasePager>  containerPagerList;
	
	int title = R.string.content_container;//标志该页面是容器
	String[] item = {"容器信息加载","基础信息","配置信息","定期检验","年度检验","验收检验","月度检验"};

	public VesselPager(Activity activity) {
		super(activity);
	}
	
	@Override
	public void initData() {
		//System.out.println("vessel pager 初始化数据");
		tvTitle.setText(R.string.content_container);
		ibMenu.setVisibility(View.VISIBLE);
		
		containerLeftMenuList=new ArrayList<String>();
		for (int i = 0; i < item.length; i++) {
			containerLeftMenuList.add(item[i]);
		}
		
		processData();
		
	}

	private void processData() {
		containerPagerList = new ArrayList<MenuDetailBasePager>();
		containerPagerList.add(new VesselTagLoadPager(mActivity));
		containerPagerList.add(new VesselInfoPager(mActivity));
		containerPagerList.add(new VesselConfigPager(mActivity));
		containerPagerList.add(new VesselPeriodicPager(mActivity));
		containerPagerList.add(new VesselAnnualPager(mActivity));
		containerPagerList.add(new VesselCheckPager(mActivity));
		containerPagerList.add(new VesselMonthlyCheckPager(mActivity));

		// 把左侧菜单数据传递给LeftMenuFragment来处理
		MainUI mainUI = ((MainUI) mActivity);
		LeftMenuFragment leftMenuFragment = mainUI.getLeftMenuFragment();
		leftMenuFragment.setMenuDataList(containerLeftMenuList,title);
	}
	
	/**
	 * 根据索引切换当前的页面
	 * @param position
	 */
	public void switchCurrentPager(int position) {
		//System.out.println("根据索引切换当前的页面,位置"+position);
		String title  = item[position];
		tvTitle.setText(title);
		MenuDetailBasePager pager = containerPagerList.get(position);
		flContent.removeAllViews(); // 清除所有的子布局
		flContent.addView(pager.rootView);
		pager.initData();
	}
}
