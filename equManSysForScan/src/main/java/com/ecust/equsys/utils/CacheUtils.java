package com.ecust.equsys.utils;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * 
 * @author smxiang
 *缓存工具类
 */
public class CacheUtils {
	
	private static final String CATCH_FILE_NAME = "equsyshasbeanopened";
	private static SharedPreferences mSharedPreferences;
	
	public static void putBoolean(Context context, String key, boolean value){
		if(mSharedPreferences==null){
		mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME, Context.MODE_PRIVATE);
		}
		mSharedPreferences.edit().putBoolean(key, value).commit();	
	}
	
	public static boolean getBoolean(Context context, String key, boolean defValue){
		if (mSharedPreferences==null) {
			mSharedPreferences=context.getSharedPreferences(CATCH_FILE_NAME, Context.MODE_PRIVATE);
		}
		return mSharedPreferences.getBoolean(key, defValue);
	}
	/**
	 * 向SharedPreferences中存储一个字符串
	 * @param context
	 * @param key
	 * @param value
	 */
	public static void putString(Context context, String key, String value) {
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME, Context.MODE_PRIVATE);
		}
		mSharedPreferences.edit().putString(key, value).commit();
	}

	/**
	 * 从SharedPreferences中取一个字符串
	 * @param context
	 * @param key
	 * @param defValue 缺省值
	 */
	public static String getString(Context context, String key, String defValue) {
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME, Context.MODE_PRIVATE);
		}
		return mSharedPreferences.getString(key, defValue);
	}
	
	
}