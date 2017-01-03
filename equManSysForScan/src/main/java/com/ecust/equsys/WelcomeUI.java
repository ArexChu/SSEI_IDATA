package com.ecust.equsys;


import com.ecust.equsys.utils.CacheUtils;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;


public class WelcomeUI extends Activity {

	@ViewInject(R.id.rl_welcome_root)
	RelativeLayout rlroot;
	
	// 是否打开过主页面的键key
	public static final String IS_OPEN_MAIN_PAGER_KEY = "is_open_main_pager_key";
	
	@Override
   	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		ViewUtils.inject(this);
		init();
	}

	
	/**
	 * 初始化控件和动画
	 */
	private void init() {
		AnimationSet mAnimationSet = new AnimationSet(false);
		//缩放
		ScaleAnimation scaleAnimation = new ScaleAnimation(
		0, 1, 
		0, 1, 
		Animation.RELATIVE_TO_SELF, 0.5f,
		Animation.RELATIVE_TO_SELF, 0.5f);
		scaleAnimation.setDuration(1000);
		scaleAnimation.setFillAfter(true);		
		//渐变
		AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
		alphaAnimation.setDuration(2000);
		alphaAnimation.setFillAfter(true);
		//将动画加到动画集合中
		mAnimationSet.addAnimation(scaleAnimation);
		mAnimationSet.addAnimation(alphaAnimation);
		mAnimationSet.setAnimationListener(new MyAnimationListener());
		//执行动画
		rlroot.startAnimation(mAnimationSet);	
	}
	class MyAnimationListener implements AnimationListener{

		@Override
		public void onAnimationStart(Animation animation) {

		}

		@Override
		public void onAnimationEnd(Animation animation) {
			// 判断当前是跳转到主页面还是引导页面
			boolean isOpenMainPager = CacheUtils.getBoolean(WelcomeUI.this, IS_OPEN_MAIN_PAGER_KEY, false);
			if(isOpenMainPager) {
				// 跳转到主页面
				startActivity(new Intent(WelcomeUI.this, MainUI.class));
			} else {
				startActivity(new Intent(WelcomeUI.this, GuideUI.class));
			}
			
			finish();
		}

		@Override
		public void onAnimationRepeat(Animation animation) {

		}

		
	}

}
