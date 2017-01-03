package com.ecust.equsys.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 所有fragment的基类
 * @author smxiang
 * 初始化布局的方法抽取: 抽象
 * 初始化数据的方法抽取: 可选
 *
 */
public abstract class BaseFragment extends Fragment {
	
	public Activity mActivity;//基类最好申明public 子类用起来方便

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mActivity = getActivity();//fragment必须绑定在 activity上，获取绑定上的activity实例
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = initView();
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		//activity 已经初始化完毕，当前需要初始化Fragment的数据
		initDate();
	}
	
	/**
	 * 初始化Fragment的布局
	 * @return
	 */
	public abstract View initView();
	
	/**
	 * 初始化数据, 子类覆盖此方法, 来实现自己的数据初始化操作
	 */
	public void initDate() {
		
	}
}
