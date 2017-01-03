package com.ecust.equsys.domain.vessel;


/**
 * 本类用于添加新的管道
 * @author smxiang
 *
 */
public class VesselBaseAdd extends VesselBaseEntity {
	public VesselBaseAdd() {
		super();
		this.db_Description = "新增设备";
		this.method = "addPipeID";//上传servlet的方法名称，很重要		
	}
	public String pipeID;
	public String getPipeID() {
		return pipeID;
	}
	public void setPipeID(String pipeID) {
		this.pipeID = pipeID;
	}
	@Override
	public String toString() {
		return "VesselBaseAdd [pipeID=" + pipeID + ", scan_type=" + scan_type
				+ ", servlet_type=" + servlet_type + ", id=" + id
				+ ", scan_Tag_ID=" + scan_Tag_ID + ", scan_Mission_ID="
				+ scan_Mission_ID + ", db_Description=" + db_Description
				+ ", method=" + method + "]";
	}
	
	
}
