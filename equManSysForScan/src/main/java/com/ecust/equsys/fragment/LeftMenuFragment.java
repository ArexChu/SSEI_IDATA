package com.ecust.equsys.fragment;

import java.util.List;

import com.ecust.equsys.MainUI;
import com.ecust.equsys.R;
import com.ecust.equsys.base.BaseFragment;
import com.ecust.equsys.base.impl.VesselPager;
import com.ecust.equsys.base.impl.PipePager;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * 正文的fragment
 * @author smxiang
 *
 */
public class LeftMenuFragment extends BaseFragment implements OnItemClickListener {

	private List<String> mDataList;
	private ListView mListView;
	private LeftMenuAdapter mAdapter;
	private int currentSelectItem; // 当前被选中菜单的变量
	private int title;//当前选中页面名称


	@Override
	public View initView() {
		title=R.string.content_pipe;
		mListView = new ListView(mActivity);
		mListView.setBackgroundColor(Color.BLACK);
		mListView.setCacheColorHint(Color.TRANSPARENT); // 处理按住拖动时, 变白的效果
		mListView.setPadding(0, 62, 0, 0);
		mListView.setSelector(android.R.color.transparent); // 给ListView的item设置一个点击的选择器: 透明
		return mListView;
	}
	
	class LeftMenuAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return mDataList.size();
		}


		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder viewHolder;

			if (convertView == null) {
				// inflate the layout
				LayoutInflater inflater = (mActivity).getLayoutInflater();
				convertView = inflater.inflate(R.layout.left_menu_item, null);

				// well set up the ViewHolder
				viewHolder = new ViewHolder();
				viewHolder.textView = (TextView) convertView.findViewById(R.id.textViewItem);

				// store the holder with the view.
				convertView.setTag(viewHolder);
			}else{
				// we've just avoided calling findViewById() on resource everytime
				// just use the viewHolder
				viewHolder = (ViewHolder) convertView.getTag();
			}

				viewHolder.textView.setText(mDataList.get(position));

			return convertView;
		/*	TextView tv = (TextView) View.inflate(mActivity, R.layout.left_menu_item, null);
			tv.setText(mDataList.get(position));
			Typeface face = Typeface.createFromAsset (mActivity.getAssets(), "fonts/kaiti.ttf");
			tv.setTypeface (face);
			// 当前获取的条目的位置和被选中的条目的位置一样, 应该把当前的条目置为深色
			tv.setEnabled(position == currentSelectItem);
			return tv;*/
			
		}

		@Override
		public Object getItem(int position) {
			return null;
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}
		
	}
	
	
	/**
	 * 设置菜单的数据
	 */
	public void setMenuDataList(List<String> dataList, int title){

		//System.out.println("加载左侧菜单");

		this.mDataList = dataList;
		this.title = title;
		
		// 初始化默认选中的菜单: 0
		currentSelectItem = 0;
		// 初始化默认选中菜单对应的页面
		switchMenuDetailPager(0);
		//System.out.println("初始化默认选中菜单对应的页面");
		mAdapter = new LeftMenuAdapter();
		mListView.setAdapter(mAdapter);
		mListView.setOnItemClickListener(this);
		
		
	}


	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		currentSelectItem = position;
		mAdapter.notifyDataSetChanged();
		
		// 把菜单缩回去
		MainUI mainUI = (MainUI) mActivity;
		SlidingMenu slidingMenu = mainUI.getSlidingMenu();
		slidingMenu.toggle(); // 控制菜单显示还是隐藏, 如果当前菜单是显示, 就隐藏.
		
		// 把当前选中的菜单对应的页面展示出来
		switchMenuDetailPager(position);
		
	} 
	
	
	/**
	 * 根据索引来切换菜单对应的详情页面
	 */
	private void switchMenuDetailPager(int position) {
		//System.out.println("切换菜单对应的详情页面,位置："+position);
		MainUI mainUI = (MainUI) mActivity;
		ContentFragment contentFragment = mainUI.getContentFragment();
		switch (title) {
		case R.string.content_pipe:
			PipePager pipePager = contentFragment.getPipePagerInstance();
			pipePager.switchCurrentPager(position);
			break;
		case R.string.content_container:
			VesselPager containerPager = contentFragment.getContainerPagerInstance();
			containerPager.switchCurrentPager(position);
			break;	
		default:
			break;
		}

	}

	// our ViewHolder.
	// caches our TextView
	static class ViewHolder {
		TextView textView;
	}


}
