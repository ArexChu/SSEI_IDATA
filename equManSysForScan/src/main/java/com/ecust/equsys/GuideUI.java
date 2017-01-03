package com.ecust.equsys;

import java.util.ArrayList;
import java.util.List;
import com.ecust.equsys.utils.CacheUtils;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.LinearLayout.LayoutParams;

/**
 * 引导页面
 * @author smxiang
 *
 */
public class GuideUI extends Activity implements OnClickListener {
	
	@ViewInject(R.id.vp_guide)
	private ViewPager mViewPager;
	
	@ViewInject(R.id.btn_start_experience)
	private Button startButton;
	
	@ViewInject(R.id.ll_guide_point_group)
	private LinearLayout llpointGroup;
	
	@ViewInject(R.id.view_guide_dot_move)//移动的点
	private View moveDotView;

	private List<ImageView> imageViewsliList;
	private int basicWidth;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// 去除标题, 必须在setContentView之前调用
		
		
		setContentView(R.layout.guide);
		ViewUtils.inject(this);
		//定义字体
		Typeface face = Typeface.createFromAsset (getAssets(), "fonts/kaiti.ttf");
		startButton.setTypeface (face);
		init();
		
	}

	/**
	 * 初始化控件
	 */
	private void init() {
		
		//准备数据
		initDate();
		mViewPager.setAdapter(new GuidePageAdapter());
		mViewPager.setOnPageChangeListener(new MyOnPageChangeListener());
		startButton.setOnClickListener(this);
		
		// 获得视图树观察者, 观察当整个布局的layout时的事件
		moveDotView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {

		/**
		 * 当全局开始布局layout时回调此方法
		 */
		@SuppressWarnings("deprecation")
		@Override
		public void onGlobalLayout() {
			// 此方法只需要执行一次就可以: 把当前的监听事件从视图树中移除掉, 以后就不会在回调此事件了.
			moveDotView.getViewTreeObserver().removeGlobalOnLayoutListener(this);			
			basicWidth = llpointGroup.getChildAt(1).getLeft() - llpointGroup.getChildAt(0).getLeft();
			}
		});	
	}
		
	/**
	 * 准备数据
	 */
	private void initDate() {
		int[] imageResIDs={
				R.drawable.guide_background_1,
				R.drawable.guide_background_2
		};
		
		imageViewsliList = new ArrayList<ImageView>();
		ImageView iv;
		for (int i = 0; i < imageResIDs.length; i++) {
			iv = new ImageView(this);
			iv.setBackgroundResource(imageResIDs[i]);
			imageViewsliList.add(iv);
			
			//向线性布局中加入点
			View view = new View(this);
			view.setBackgroundResource(R.drawable.guide_dot_normal);
			LayoutParams params = new  LayoutParams(10,10);
			if(i != 0) {
				params.leftMargin = 10;
			}
			view.setLayoutParams(params);
			llpointGroup.addView(view);
						
		}
	}

	class GuidePageAdapter extends PagerAdapter{

		@Override
		public int getCount() {
			return imageViewsliList.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0==arg1;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((View) object);
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			// 向ViewPager添加一个ImageView
			ImageView iv = imageViewsliList.get(position);
			container.addView(iv);
			
			//把添加的view返回去
			return iv;
			
		}
		
	}
	
	class MyOnPageChangeListener implements OnPageChangeListener{
		
		/**
		 * 当页面滚动时触发此方法
		 * @param position 当前正在被选中的position
		 * @param positionOffset 页面移动的比值
		 * @param positionOffsetPixels 页面移动的像素
		 */
		@Override
		public void onPageScrolled(int position, float positionOffset,
				int positionOffsetPixels) {
			// 点最终移动的距离 = 间距 * 比值;
			int leftMargin = (int) (basicWidth * (position + positionOffset));
			RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) moveDotView.getLayoutParams();
			lp.leftMargin = leftMargin;
			moveDotView.setLayoutParams(lp);
		}
		
		/**
		 * 当页面选中时触发此方法
		 */
		@Override
		public void onPageSelected(int position) {
			if(position == imageViewsliList.size() -1) {
				startButton.setVisibility(View.VISIBLE);
			} else {
				startButton.setVisibility(View.GONE);
			}
		}
		
		/**
		 * 当页面滚动状态改变时触发此方法
		 */
		@Override
		public void onPageScrollStateChanged(int state) {

		}

	
	}

	@Override
	public void onClick(View v) {
		// 向SharedPreferences中存储一个打开过的标记
		CacheUtils.putBoolean(this, WelcomeUI.IS_OPEN_MAIN_PAGER_KEY, true);
		// 跳转到主页面
		startActivity(new Intent(this, MainUI.class));		
		// 把自己关掉
		finish();	
	}

}
