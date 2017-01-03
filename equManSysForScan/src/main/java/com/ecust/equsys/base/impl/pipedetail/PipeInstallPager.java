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
import com.ecust.equsys.base.impl.pipedetail.data.PipeInstallData;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;
import java.util.List;

public class PipeInstallPager extends MenuDetailBasePager implements ViewPager.OnPageChangeListener {

	@ViewInject(R.id.tpi_pipe_menu_manage_detail)
	private TabPageIndicator mIndicator;

	@ViewInject(R.id.vp_pipe_menu_manage_detail)
	private ViewPager mViewPager;

	List<MenuDetailBasePager> pipeTabDetailPagers;// 页签对应的页面

	String[] indicatorItem = {"安装安全质量监督检验结论记录","监督检验的工业管道基本情况记录","监督检验的工作内容及工作基本情况记录","对相关单位安全质量管理行为的评价记录","工业管道元件及焊接材料的材质审查记录",
			"工业管道焊接质量抽查记录","工业管道补偿器和热传导支承件安装质量抽查记录","工业管道附属设施和设备安装质量抽查记录","工业管道穿跨越及隐蔽工程安装质量抽查记录","工业管道防腐、绝热施工质量抽查记录",
			"工业管道通球、扫线、干燥质量审查记录","工业管道强度试验、泄漏性试验记录","工业管道安全保护装置检查记录","工业管道安装竣工资料审查报告记录","遗留质量问题的处理意见记录",
			"压力管道底片复审记录表"};// 页签对应的数据

	public PipeInstallPager(Activity activity) {
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
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab1Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab2Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab3Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab4Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab5Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab6Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab7Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab8Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab9Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab10Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab11Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab12Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab13Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab14Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab15Data()));
		pipeTabDetailPagers.add(new MenuDetailUI(mActivity, PipeInstallData.getTab16Data()));
		/**
		 *
		 */


		mViewPager.setAdapter(new PipeInstallAdapter());
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

	class PipeInstallAdapter extends PagerAdapter {

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
