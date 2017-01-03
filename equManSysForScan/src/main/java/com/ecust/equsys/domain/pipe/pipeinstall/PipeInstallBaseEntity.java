package com.ecust.equsys.domain.pipe.pipeinstall;

import com.ecust.equsys.domain.BaseEntity;

public class PipeInstallBaseEntity extends BaseEntity {
	
	/**
	 * 管道实体类的基类，为了辨识是管道还是容器,以及规定了要上传的servlet名称
	 */
	public String scan_Sys_ID;

	public final String scan_type = BaseEntity.SCAN_PIPE_TYPE;
	
	public final String servlet_type = "restful/pipeInstall";

	public String getScan_Sys_ID() {
		return scan_Sys_ID;
	}

	public void setScan_Sys_ID(String scan_Sys_ID) {
		this.scan_Sys_ID = scan_Sys_ID;
	}

	public String getScan_type() {
		return scan_type;
	}
	public String getServlet_type() {
		return servlet_type;
	}


}
