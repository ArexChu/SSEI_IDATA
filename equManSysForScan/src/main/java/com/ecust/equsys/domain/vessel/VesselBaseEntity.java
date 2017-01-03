package com.ecust.equsys.domain.vessel;

import com.ecust.equsys.domain.BaseEntity;

public class VesselBaseEntity extends BaseEntity {
	
	/**
	 * 管道实体类的基类，为了辨识是管道还是容器,以及规定了要上传的servlet名称
	 */
	public final String scan_type = BaseEntity.SCAN_SESSEL_TYPE;
	
	public final String servlet_type = "restful/vessel";
	
	public String getScan_type() {
		return scan_type;
	}
	public String getServlet_type() {
		return servlet_type;
	}	
	
	
}
