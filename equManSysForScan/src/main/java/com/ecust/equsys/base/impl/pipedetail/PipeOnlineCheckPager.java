package com.ecust.equsys.base.impl.pipedetail;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.ecust.equsys.MainUI;
import com.ecust.equsys.R;
import com.ecust.equsys.base.MenuDetailBasePager;
import com.ecust.equsys.base.MenuDetailUI;
import com.ecust.equsys.base.impl.pipedetail.data.PipeOnlineCheckData;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;
import java.util.List;

public class PipeOnlineCheckPager extends MenuDetailBasePager implements ViewPager.OnPageChangeListener{

	@ViewInject(R.id.tpi_pipe_menu_manage_detail)
	private TabPageIndicator mIndicator;

	@ViewInject(R.id.vp_pipe_menu_manage_detail)
	private ViewPager mViewPager;

	List<MenuDetailBasePager> pipeTabDetailPagers;// 页签对应的页面

	String[] indicatorItem = {"管道测厚检查","在线检验记录"};// 页签对应的数据

	public PipeOnlineCheckPager(Activity activity) {
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
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeOnlineCheckData.getTab1Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeOnlineCheckData.getTab2Data()));
		/**
		 * 
		 */


		mViewPager.setAdapter(new PipeBusiAdapter());
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
	
class PipeBusiAdapter extends PagerAdapter {
	
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
