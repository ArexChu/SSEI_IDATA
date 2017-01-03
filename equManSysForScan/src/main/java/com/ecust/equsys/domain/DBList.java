package com.ecust.equsys.domain;

public class DBList extends BaseEntity {
	/**
	 * 该类用于记录每个提交的对象，方便上传时候页面的展示
	 */
	public String db_Current_Time;//记录当前时间
	public String className;//类名
	
	public String getDb_Current_Time() {
		return db_Current_Time;
	}
	
	public void setDb_Current_Time(String db_Current_Time) {
		this.db_Current_Time = db_Current_Time;
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "DBList [db_Current_Time=" + db_Current_Time + ", className="
				+ className + ", id=" + id + ", scan_Tag_ID=" + scan_Tag_ID
				+ ", scan_Mission_ID=" + scan_Mission_ID + ", db_Description="
				+ db_Description + "]";
	}

	
	
	
	

}
