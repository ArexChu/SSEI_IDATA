package com.ecust.equsys.domain;

/**
 * 描述：所有实体类的基类
 */
public class BaseEntity {
	public int id;
	public String scan_Tag_ID;//标签扫描到的信息
	public String scan_Mission_ID;//输入的业务编号

	public String db_Description;//数据库页面展现的中文名称
	public String method;//上传后调用Servlet的方法名
	public static final String SCAN_PIPE_TYPE="scan_Pipe_type";
	public static final String SCAN_SESSEL_TYPE="scan_Sessel_type";

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getScan_Tag_ID() {
		return scan_Tag_ID;
	}
	public void setScan_Tag_ID(String scan_Tag_ID) {
		this.scan_Tag_ID = scan_Tag_ID;
	}
	public String getScan_Mission_ID() {
		return scan_Mission_ID;
	}
	public void setScan_Mission_ID(String scan_Mission_ID) {
		this.scan_Mission_ID = scan_Mission_ID;
	}

	public String getDb_Description() {
		return db_Description;
	}
	public void setDb_Description(String db_Description) {
		this.db_Description = db_Description;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}

	public static String getScanPipeType() {
		return SCAN_PIPE_TYPE;
	}

	public static String getScanSesselType() {
		return SCAN_SESSEL_TYPE;
	}

	@Override
	public String toString() {
		return "BaseEntity{" +
				"id=" + id +
				", scan_Tag_ID='" + scan_Tag_ID + '\'' +
				", scan_Mission_ID='" + scan_Mission_ID + '\'' +
				", db_Description='" + db_Description + '\'' +
				", method='" + method + '\'' +
				'}';
	}
}
