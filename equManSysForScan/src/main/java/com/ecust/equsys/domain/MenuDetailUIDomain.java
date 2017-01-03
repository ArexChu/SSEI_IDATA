package com.ecust.equsys.domain;

import java.util.Arrays;
import java.util.Map;

public class MenuDetailUIDomain {
	
	public Integer[] type;//类型
	public Integer[] tExpand;//扩展类型
	public String[] cItems;//中文描述
	public String[] cExpand;//中文扩展描述
	public String[] eItems;//与数据库对应的英文描述
	public String[] eExpand;//与数据库对应的扩展英文描述
	public Integer[] num;
	public Map<String, String[]> checkBoxItems;//复选框选项
	public Map<String, boolean[]> checkBoxBooleans;//是否选中的标志
	public Object entity;//对象


	@Override
	public String toString() {
		return "MenuDetailUIDomain [type=" + Arrays.toString(type)
				+Arrays.toString(tExpand) + ", cItems=" + Arrays.toString(cItems) + ", eItems="
				+ Arrays.toString(cExpand) + ", cExpand="
				+ Arrays.toString(eItems) + Arrays.toString(eExpand) + ", checkBoxItems=" + checkBoxItems
				+ ", checkBoxBooleans=" + checkBoxBooleans + ", entity="
				+ entity + "]";
	}

	public Integer[] getType() {
		return type;
	}
	public void setType(Integer[] type) {
		this.type = type;
	}
	public Integer[] gettExpand() {
		return tExpand;
	}
	public void settExpand(Integer[] tExpand) {
		this.tExpand = tExpand;
	}

	public String[] getcItems() {
		return cItems;
	}
	public void setcItems(String[] cItems) {this.cItems = cItems;}
	public String[] getcExpand() {return cExpand;}
	public void setcExpand(String[] cExpand) {
		this.cExpand = cExpand;
	}

	public String[] geteItems() {
		return eItems;
	}
	public void seteItems(String[] eItems) {
		this.eItems = eItems;
	}
	public String[] geteExpand() {
		return eExpand;
	}
	public void seteExpand(String[] eExpand) {
		this.eExpand = eExpand;
	}

	public Integer[] getNum() {
		return num;
	}
	public void setNum(Integer[] num) {
		this.num = num;
	}


	public Map<String, String[]> getCheckBoxItems() {
		return checkBoxItems;
	}
	public void setCheckBoxItems(Map<String, String[]> checkBoxItems) {
		this.checkBoxItems = checkBoxItems;
	}
	public Map<String, boolean[]> getCheckBoxBooleans() {
		return checkBoxBooleans;
	}
	public void setCheckBoxBooleans(Map<String, boolean[]> checkBoxBooleans) {
		this.checkBoxBooleans = checkBoxBooleans;
	}
	public Object getEntity() {
		return entity;
	}
	public void setEntity(Object entity) {
		this.entity = entity;
	}

}
