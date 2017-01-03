package com.ecust.equsys.adaptor;

import java.util.Calendar;

import com.ecust.equsys.R;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

/**
 * 该类经过简化后，（1）用于产生一个日期窗口，（2）用于弹出警示窗口
 * @author smxiang
 *
 */
public class MyDatePicker extends DialogFragment{
	
	public static final int DATE_PICKER_DIALOG = 1;
	public static final int ALTER_DIALOG = 2;  
	public static TextView tv;//传入的textview
	private static int current_year;//系统当前的年份
	private static int current_month;//系统当前的月份
	private static int current_day;//系统当前的日期
	
	public static MyDatePicker newInstance(int title, TextView tv) {
		if (tv!=null) {
			MyDatePicker.tv=tv;
		}
		MyDatePicker myDialogFragment = new MyDatePicker();
		initdata();
		Bundle bundle = new Bundle();
		bundle.putInt("title", title);
		myDialogFragment.setArguments(bundle);
		return myDialogFragment;
	}

	private static void initdata() {
		Calendar c = Calendar.getInstance();  
		current_year = c.get(Calendar.YEAR);  
		current_month= c.get(Calendar.MONTH);  
		current_day = c.get(Calendar.DAY_OF_MONTH); 
	}
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		int args = getArguments().getInt("title");
		//根据传进来的参数选择创建哪种Dialog
		switch (args) {
		 case ALTER_DIALOG:  
	            return new AlertDialog.Builder(getActivity())  
	                .setIcon(R.drawable.ic_launcher)  
	                .setTitle(getTag())  
	                .setPositiveButton("ok",  
	                        new DialogInterface.OnClickListener() {  
	                public void onClick(DialogInterface dialog, int whichButton) {  
	                    //点击ok触发的事件  
	                    System.out.println("click ok!");  
	                }  
	                })  
	            .setNegativeButton("cancle",  
	                    new DialogInterface.OnClickListener() {  
	                public void onClick(DialogInterface dialog, int whichButton) {  
	                    //点击cancle触发的时间  
	                    System.out.println("click cancle");  
	                }  
	                })  
	                .create();  	
		case DATE_PICKER_DIALOG:
			return new DatePickerDialog(getActivity(), new OnDateSetListener() {
				public void onDateSet(DatePicker view, int year, int monthOfYear,
						int dayOfMonth) {
					//月是从0开始的
					tv.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);
	
				}
			}, current_year,current_month,current_day);
	}
	return null;
	}	
}
