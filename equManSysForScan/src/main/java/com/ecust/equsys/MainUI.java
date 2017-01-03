package com.ecust.equsys;

import com.ecust.equsys.base.impl.UserPager;
import com.ecust.equsys.fragment.ContentFragment;
import com.ecust.equsys.fragment.LeftMenuFragment;
import com.ecust.equsys.utils.CacheUtils;
import com.ecust.equsys.utils.TempDateUtils;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.Window;

public class MainUI extends SlidingFragmentActivity {
	
	private final String LEFT_MENU_TAG = "left_menu";
	private final String MAIN_CONTENT_TAG = "main_content";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 去除标题
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//配置主界面
		setContentView(R.layout.main);
		//配置左侧菜单
		setBehindContentView(R.layout.left_menu);
		//配置菜单可用模式为左侧可用
		SlidingMenu slidingMenu = getSlidingMenu();
		slidingMenu.setMode(SlidingMenu.LEFT);
		//配置菜单可以拖拽区域：整个屏幕可以拖拽
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		//配置主界面留在屏幕上的宽度：100
		slidingMenu.setBehindOffset(100);
		initFragment();
	}

	/**
	 * 初始化Fragment对象
	 */
	private void initFragment() {
		// 获取FragmentManager对象
		FragmentManager fm = getSupportFragmentManager();
		//开启事务
		FragmentTransaction ft = fm.beginTransaction();
		//替换Fragment
		ft.replace(R.id.fl_left_menu, new LeftMenuFragment(),LEFT_MENU_TAG);
		ft.replace(R.id.fl_main, new ContentFragment(),MAIN_CONTENT_TAG);
		//提交事务
		ft.commit();
	}
	
	/**
	 * 获取左侧菜单的Fragment的对象实例
	 * @return
	 */
	public LeftMenuFragment getLeftMenuFragment() {
		FragmentManager fm = getSupportFragmentManager();
		LeftMenuFragment fragment = (LeftMenuFragment) fm.findFragmentByTag(LEFT_MENU_TAG);
		return fragment;
	}
	
	/**
	 * 获取右侧正文的Fragment的对象实例
	 * @return
	 */
	public ContentFragment getContentFragment() {
		FragmentManager fm = getSupportFragmentManager();
		ContentFragment fragment = (ContentFragment) fm.findFragmentByTag(MAIN_CONTENT_TAG);
		return fragment;
	}
	
	
	/**
	 * 应用退出时执行的代码
	 */
	@SuppressWarnings("deprecation")
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK )
		{
		// 创建退出对话框
		AlertDialog isExit = new AlertDialog.Builder(this).create();
		// 设置对话框标题
		isExit.setTitle("系统提示");
		// 设置对话框消息
		isExit.setMessage("确定要退出吗");
		// 添加选择按钮并注册监听
		isExit.setButton("确定", listener);
		isExit.setButton2("取消", listener);
		// 显示对话框
		isExit.show();

		}

		return false;
		
	}
	
	/**监听对话框里面的button点击事件*/
	DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener()
	{
		public void onClick(DialogInterface dialog, int which)
		{
			switch (which)
			{
			case AlertDialog.BUTTON_POSITIVE:// "确认"按钮退出程序
				//判断是否需要保存密码，不需要的话，将密码删掉
				if (!CacheUtils.getBoolean(MainUI.this, UserPager.SAVEPASSWORD, false)) {
					CacheUtils.putString(MainUI.this, UserPager.PASSWORD, "0");//赋值为0,相当于删掉
				}
				//将临时文件清掉
				//TempDateUtils.deleteTempDate(MainUI.this);
				finish();
				break;
			case AlertDialog.BUTTON_NEGATIVE:// "取消"第二个按钮取消对话框
				break;
			default:
				break;
			}
		}
	}; 
	
	
}
