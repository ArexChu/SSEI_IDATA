package com.ecust.equsys.utils;

import java.lang.reflect.Field;


public class BeanUtils {

    /**
     *  从一个实体中取出相应字段的值
     */
    public static  String  getStringFromBean(Object entity, String field) {
        Field classField ;
        String fieldValue="";
        try{
            classField = entity.getClass().getField(field);
            fieldValue = (String) classField.get(entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return fieldValue ;//类型
    }

    /**
     *  向一个实体中的某个字段添加值
     */
    public static  void  setStringToBean(Object entity, String fieldName, String fieldValue) {
        Field field;
        try{
            field = entity.getClass().getField(fieldName);
            field.set(entity,fieldValue);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
