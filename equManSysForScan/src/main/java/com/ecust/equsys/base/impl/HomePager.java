package com.ecust.equsys.base.impl;

import android.app.Activity;
import android.view.View;
import android.widget.RadioGroup;
import com.ecust.equsys.MainUI;
import com.ecust.equsys.R;
import com.ecust.equsys.base.BasePager;
import com.ecust.equsys.fragment.ContentFragment;
import com.zhy.view.CircleMenuLayout;
import com.zhy.view.CircleMenuLayout.OnMenuItemClickListener;
public class HomePager extends BasePager{
	

	public HomePager(Activity activity) {
		super(activity);
	}
	
	private CircleMenuLayout mCircleMenuLayout;

	private String[] mItemTexts = new String[] { "管道管理 ", "容器管理", "数据上传",
			"用户登录", "首页" };
	private int[] checkid = { R.id.rb_content_fragment_pipeline,R.id.rb_content_fragment_container,
			R.id.rb_content_fragment_cloud,R.id.rb_content_fragment_user,R.id.rb_content_fragment_home};
	
	private int[] mItemImgs = new int[] { R.drawable.home_circle_1,
			R.drawable.home_circle_2, R.drawable.home_circle_3,
			R.drawable.home_circle_4, R.drawable.home_circle_5};
	
	
	@Override
	public void initData() {
		
		MainUI mainUI = ((MainUI) mActivity);
		final ContentFragment contentFragment = mainUI.getContentFragment();
		final RadioGroup radioGroup = contentFragment.getRadioGroup();
		tvTitle.setText("承压特种设备管理系统");
		ibMenu.setVisibility(View.GONE);
		
		View view = View.inflate(mActivity, R.layout.home_pager, null);
		mCircleMenuLayout = (CircleMenuLayout) view.findViewById(R.id.id_menulayout);
		mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
		
		mCircleMenuLayout.setOnMenuItemClickListener(new OnMenuItemClickListener() {
			
			@Override
			public void itemClick(View view, int pos) {
			contentFragment.onCheckedChanged(null, checkid[pos]);
			radioGroup.check(checkid[pos]);					
			}
			
			@Override
			public void itemCenterClick(View view) {				
			}
		});
		flContent.removeAllViewsInLayout();
		flContent.addView(view);		
	}

}
