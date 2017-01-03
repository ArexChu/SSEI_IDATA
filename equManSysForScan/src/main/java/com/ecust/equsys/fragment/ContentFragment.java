package com.ecust.equsys.fragment;

import java.util.ArrayList;
import java.util.List;

import com.ecust.equsys.MainUI;
import com.ecust.equsys.R;
import com.ecust.equsys.base.BaseFragment;
import com.ecust.equsys.base.BasePager;
import com.ecust.equsys.base.impl.VesselPager;
import com.ecust.equsys.base.impl.HomePager;
import com.ecust.equsys.base.impl.PipePager;
import com.ecust.equsys.base.impl.UploadPager;
import com.ecust.equsys.base.impl.UserPager;
import com.ecust.equsys.view.NoScrollViewPager;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/**
 * 正文的fragment
 * @author smxiang
 *
 */
public class ContentFragment extends BaseFragment implements OnCheckedChangeListener, OnPageChangeListener {

	private  ContentAdapter contentAdapter;

	@ViewInject(R.id.vp_content_fragment)
	private NoScrollViewPager mViewPager;
	
	@ViewInject(R.id.rg_content_fragment)
	private RadioGroup mRadioGruop;

	private List<BasePager> pagerlist;
	
	@Override
	public View initView() {
		View view = View.inflate(mActivity,R.layout.content_fragment, null);
		// 把当前view对象注入到xUtils框架中
		ViewUtils.inject(this, view);
		return view;
	}
	
	@Override
	public void initDate() {
		//System.out.println("content fragment 启动");
		// 初始化ViewPager的数据
		pagerlist = new ArrayList<BasePager>();
		pagerlist.add(new HomePager(mActivity));
		pagerlist.add(new PipePager(mActivity));	
		pagerlist.add(new VesselPager(mActivity));
		pagerlist.add(new UploadPager(mActivity));	
		pagerlist.add(new UserPager(mActivity));	
		//绑定数据
		contentAdapter = new ContentAdapter();
		mViewPager.setAdapter(contentAdapter);
		mViewPager.setOnPageChangeListener(this);
		// 监听单选按钮组中的按钮选中的变化
		mRadioGruop.setOnCheckedChangeListener(this);
		// 设置默认选中的页面为: 首页
		mRadioGruop.check(R.id.rb_content_fragment_home);
		// 把首页的数据加载了
		pagerlist.get(0).initData();

	}
	
	
	/**
	 * 获取管道页面的实例对象
	 */
	public PipePager getPipePagerInstance() {
		PipePager pipePager = (PipePager) pagerlist.get(1);
		return pipePager;
	}
	
	public VesselPager getContainerPagerInstance() {
		VesselPager containerPager = (VesselPager) pagerlist.get(2);
		return containerPager;
	}
	
	public RadioGroup getRadioGroup() {
		return mRadioGruop;
	}
	
	class ContentAdapter extends PagerAdapter{

		@Override
		public int getCount() {
			return pagerlist.size();
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view==object;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			// 把对应pagerList集合中的position位置的页面的布局添加到ViewPager中, 并返回
			BasePager pager = pagerlist.get(position);
			container.addView(pager.rootView); // 把布局添加到ViewPager中

			return pager.rootView;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((View) object);
		}
	}

	/**
	 * checkedId 当前选中的RadioButton的id
	 */
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.rb_content_fragment_home:
			mViewPager.setCurrentItem(0);
			isEnabledSlidingMenu(false);
			break;
		case R.id.rb_content_fragment_pipeline:
			mViewPager.setCurrentItem(1);
			isEnabledSlidingMenu(true);
			break;
		case R.id.rb_content_fragment_container:
			mViewPager.setCurrentItem(2);
			isEnabledSlidingMenu(true);
			break;
		case R.id.rb_content_fragment_cloud:
			mViewPager.setCurrentItem(3);
			isEnabledSlidingMenu(false);
			break;
		case R.id.rb_content_fragment_user:
			mViewPager.setCurrentItem(4);
			isEnabledSlidingMenu(false);
			break;
		default:
			break;
		}
		
	}

	@Override
	public void onPageScrolled(int position, float positionOffset,
			int positionOffsetPixels) {

	}
	
	/**
	 * 当页面被选中时触发此方法, position就是当前页面的索引
	 */
	@Override
	public void onPageSelected(int position) {
		pagerlist.get(position).initData(); // 把当前选中的页面的数据加载了
		
	}

	@Override
	public void onPageScrollStateChanged(int state) {

	}

	/**
	 * 是否启用侧滑菜单
	 * @param flag true 启用, false 不启用
	 */
	private void isEnabledSlidingMenu(boolean flag) {
		// 把上下文实例转换成MainUI的实例
		MainUI mainUI = ((MainUI) mActivity);
		// 通过mainUI获取菜单的控制器对象
		SlidingMenu slidingMenu = mainUI.getSlidingMenu();
		if(flag) {
			// 可用
			slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		} else {
			// 不可用
			slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
		}
	}


}
