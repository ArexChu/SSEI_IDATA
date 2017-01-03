package com.ecust.equsys.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class TempDateUtils {
	private static final String CATCH_FILE_NAME_TEMP = "equsyshasbeanopenedtemp";
	private static SharedPreferences mSharedPreferences;

	/**
	 * 从SharedPreferences中取一个字符串数组
	 */
	public static String[] getStringArray(Context context, String key, String defValue) {
		 String regularEx = "#";
         String[] values;
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		String string  = mSharedPreferences.getString(key, defValue);
		if (string .equals(defValue) ) {
			return null;
		}else {
			values = string.split(regularEx);
	        return values;
		}
	}


	/**
	 * 向SharedPreferences中存储一个字符串数组
	 */
	public static void putStringArray(Context context, String key, String[] array) {
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		String regularEx = "#";
        String str = "";
        if (array != null && array.length > 0) {
            for (String value : array) {
            	if (value==null) {
					value=" ";//一定不能少空，否则在取出的时候会出问题
				}
                 str += value;
                 str += regularEx;
            }
		mSharedPreferences.edit().putString(key, str).apply();
        }

	}

	/**
	 * 向SharedPreferences中存储一个字符串
	 */
	public static void putString(Context context, String key, String value) {
		//System.out.println("存入字符串的key是"+key);
		//System.out.println("存入字符串的value是"+value);
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		mSharedPreferences.edit().putString(key, value).apply();
	}

	/**
	 * 从SharedPreferences中取一个字符串
	 * @param context 上下文
	 * @param key 键
	 * @param defValue 缺省值
	 */
	public static String getString(Context context, String key, String defValue) {
		//System.out.println("取出字符串的key是"+key);
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		return mSharedPreferences.getString(key, defValue);
	}


	public static void deleteTempDate(Context context) {
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		mSharedPreferences.edit().clear().apply();
	}

	/**
	 * 向SharedPreferences中存储一个map
	 */
	public static void putMap(Context context, String key, Map<String, boolean[]> checkBoxBooleans) {
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		//将map转换为byte[]
		ByteArrayOutputStream toByte = new ByteArrayOutputStream();
		try {
	        // 创建对象输出流，并封装字节流
	        ObjectOutputStream oos = new ObjectOutputStream(toByte);
	        // 将对象写入字节流
	        oos.writeObject(checkBoxBooleans);
	        // 将字节流编码成base64的字符窜
	        String oAuth_Base64 = new String(Base64.encodeToString(toByte.toByteArray(), Base64.DEFAULT));
	        mSharedPreferences.edit().putString(key, oAuth_Base64).apply();
	    } catch (IOException e) {
	    }

        }

	/**
	 * 从SharedPreferences中读取一个map
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, boolean[]> getMap(Context context, String key,String defValue) {
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		String productBase64 = mSharedPreferences.getString(key,defValue);
		if (productBase64 .equals(defValue) ) {
			return null;
		}
		Map<String, boolean[]> map=null;
	    //读取字节
	    byte[] base64 = Base64.decode(productBase64, Base64.DEFAULT);

	    //封装到字节流
	    ByteArrayInputStream bais = new ByteArrayInputStream(base64);
	    try {
	        //再次封装
	        ObjectInputStream bis = new ObjectInputStream(bais);
	        try {
	            //读取对象
	        	 map= (Map<String, boolean[]>) bis.readObject();
	        } catch (ClassNotFoundException e) {  
	            e.printStackTrace();
	        }  
	    } catch (Exception e) {  
	        e.printStackTrace();
	    } 
	    return map;
	}

	//保存用户创建的测点个数
	public static int getInt(Context context, String key){
		if(mSharedPreferences == null) {
		mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		return mSharedPreferences.getInt(key, 0);
	}

	public static void putInt(Context context, String key, int in){
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		mSharedPreferences.edit().putInt(key, in).apply();
	}

	//删除下载数据
	public static void deleteTempInfo(Context context, String key) {
		if(mSharedPreferences == null) {
			mSharedPreferences = context.getSharedPreferences(CATCH_FILE_NAME_TEMP, Context.MODE_PRIVATE);
		}
		mSharedPreferences.edit().remove(key).apply();
	}

}
	
	
	
	
	
	
	