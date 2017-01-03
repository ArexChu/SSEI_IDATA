package com.ecust.equsys.base.impl;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.ecust.equsys.R;
import com.ecust.equsys.adaptor.UpLoadAdapter;
import com.ecust.equsys.base.BasePager;
import com.ecust.equsys.domain.DBList;
import com.ecust.equsys.utils.DbHelper;

public class UploadPager extends BasePager{

	public UploadPager(Activity activity) {
		super(activity);
		//System.out.println("新建了UploadPager");
	}

	private ListView myListView;
	private DbHelper dbHelper;//数据库帮助类
	List<DBList> dbLists=new ArrayList<DBList>();
	
	ListAdapter adapter;
	//private List<DBList> dbLists;

	@Override
	public void initData() {
		tvTitle.setText(R.string.content_upload);
		ibMenu.setVisibility(View.GONE);

		View view = View.inflate(mActivity, R.layout.menu_body,null);
		myListView=(ListView) view.findViewById(R.id.menu_body_list_items);
		dbHelper=DbHelper.getInstance(mActivity);
		
		//从数据库中取数据
		dbLists = dbHelper.searchAll(DBList.class);
		adapter = UpLoadAdapter.getAdapter(mActivity,dbLists);
		myListView.setAdapter(adapter);
		flContent.removeAllViews(); // 清除所有的子布局
		flContent.addView(view);

	}
	
}
