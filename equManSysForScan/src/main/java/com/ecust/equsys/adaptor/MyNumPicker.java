package com.ecust.equsys.adaptor;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
//import android.util.Log;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * 该类经过简化后，（1）用于产生一个日期窗口，（2）用于弹出警示窗口
 *
 *
 */
public class MyNumPicker extends DialogFragment{
    //public static final String TAG = MyBasicAdaptor.class.getSimpleName();

	public static TextView tv;//传入的textview
	public static MyNumPicker newInstance(TextView tv) {
		if (tv!=null) {
			MyNumPicker.tv=tv;
		}
		return new MyNumPicker();
	}


	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
        RelativeLayout linearLayout = new RelativeLayout(getActivity());
        final NumberPicker numberPicker = new NumberPicker(getActivity());
        numberPicker.setMaxValue(300);
        numberPicker.setMinValue(0);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(50, 50);
        RelativeLayout.LayoutParams numPicerParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        numPicerParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        linearLayout.setLayoutParams(params);
        linearLayout.addView(numberPicker, numPicerParams);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle("数值");
        alertDialogBuilder.setView(linearLayout);
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("设置",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                numberPicker.clearFocus();
                                tv.setText(String.valueOf(numberPicker.getValue()));
                            }
                        })
                .setNegativeButton("取消",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        return alertDialog;
    }


}
