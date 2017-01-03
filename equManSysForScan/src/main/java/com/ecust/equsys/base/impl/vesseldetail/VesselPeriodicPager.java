package com.ecust.equsys.base.impl.vesseldetail;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.ecust.equsys.MainUI;
import com.ecust.equsys.R;
import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.MenuDetailUI;
import com.ecust.equsys.base.impl.vesseldetail.data.VesselPeriodicData;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;
import java.util.List;

public class VesselPeriodicPager extends MenuDetailBasePager implements ViewPager.OnPageChangeListener{

	@ViewInject(R.id.tpi_pipe_menu_manage_detail)
	private TabPageIndicator mIndicator;
	
	@ViewInject(R.id.vp_pipe_menu_manage_detail)
	private ViewPager mViewPager;
	
	List<MenuDetailBasePager> pipeTabDetailPagers;// 页签对应的页面
		
	String[] indicatorItem = {"压力容器宏观检验记录","壁厚测定记录","壁厚校核记录","射线检测记录","超声检测记录",
			"衍射时差法（TOFD）超声检测记录","磁粉检测记录","渗透检测记录","声发射检测记录","材料成分分析记录",
			"硬度检测记录","金相分析记录","安全附件检验记录","耐压试验记录","气密性试验记录",
			"氨检漏试验记录","氦、卤素检漏试验记录","附加检验记录","搪玻璃压力容器搪玻璃层定期检验记录","石墨压力容器定期检验记录附页",
			"石墨衬里压力容器定期检验记录附页","玻璃钢压力容器定期检验记录附页","玻璃钢衬里压力容器定期检验记录附页","塑料压力容器定期检验记录附页","塑料衬里压力容器定期检验记录附页",
			"容器定期检验结论（必填）"};// 页签对应的数据
	
	public VesselPeriodicPager(Activity activity) {
		super(activity);
	}

	@Override
	public View initView() {
		View view = View.inflate(mActivity, R.layout.menu_head_detail, null);
		ViewUtils.inject(this,view);
		return view;
	}

	@Override
	public void initData() {
		
		pipeTabDetailPagers= new ArrayList<MenuDetailBasePager>();

		/**
		 * 添加页签对应的页面
		 */
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab1Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab2Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab3Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab4Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab5Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab6Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab7Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab8Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab9Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab10Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab11Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab12Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab13Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab14Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab15Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab16Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab17Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab18Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab19Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab20Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab21Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab22Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab23Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab24Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab25Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, VesselPeriodicData.getTab26Data()));
		/**
		 * 
		 */


		mViewPager.setAdapter(new VesselPeridic());
		// 当把ViewPager设置给Indicator时, 自己的OnPageChangeListener事件不可用了, 会被Indicator来响应.
		// mViewPager.setOnPageChangeListener(this) 是不管用的
		
		// 给TabPageIndicator关联ViewPager
		// 当mIndicator和ViewPager关联起来之后, mIndicator的数据就由关联上的ViewPager的adapter来提供
		mIndicator.setViewPager(mViewPager);
		mIndicator.setOnPageChangeListener(this);
	}
	
	@OnClick(R.id.btn_pipe_manage_menu_detail_next_tab)
	public void nextTab(View v) {
		// 向下移动一页
		mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1);
	}
	
class VesselPeridic extends PagerAdapter {
	
	/**
	 * 此方法是给mIndicator提供的页签数据
	 */
	@Override
	public CharSequence getPageTitle(int position) {
		return indicatorItem[position];
	}
	
	@Override
	public int getCount() {
		return pipeTabDetailPagers.size();
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view==object ;
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		MenuDetailBasePager pager = pipeTabDetailPagers.get(position);
		container.addView(pager.rootView);
		pager.initData(); // 加载数据
		return pager.rootView;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View) object);
	}


	}

	@Override
	public void onPageScrolled(int position, float positionOffset,
			int positionOffsetPixels) {

	}

	@Override
	public void onPageSelected(int position) {
		if(position == 0) {
			// 当前是第一个页签, 可以把左侧菜单拖拽出来
			((MainUI) mActivity).getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		} else {
			// 当前不是第一个页签, 不可以把左侧菜单拖拽出来, 应该响应ViewPager页面切换的事件
			((MainUI) mActivity).getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
		}

	}

	@Override
	public void onPageScrollStateChanged(int state) {

	}
}
