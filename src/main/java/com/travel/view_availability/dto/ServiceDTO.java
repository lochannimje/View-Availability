package com.travel.view_availability.dto;



import com.travel.view_availability.entity.ServiceEntity;

public class ServiceDTO {

	


	private Integer serviceId;
	private String date;
	private String source;
	private String deptTime;
	private String dest;
	private String arrivalTime;
	private String travelMode;
	private Integer seatsAvailable;
	private String shareMode;
	private Integer price;
	
	
	
	public ServiceDTO() {
		super();
	}
	
//	@Override
//	public String toString() {
//		return "Buyer [buyerId=" + buyerId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
//				+ ", password=" + password + ", isPrivileged=" + isPrivileged + ", rewardPoints=" + rewardPoints
//				+ ", isActive=" + isActive + "]";
//	}

	
	
	// Converts Entity into DTO
	public static ServiceDTO valueOf(ServiceEntity serviceEntity) {
		ServiceDTO serviceDTO = new ServiceDTO();
		serviceDTO.setServiceId(serviceEntity.getServiceId());
		serviceDTO.setDate(serviceEntity.getDate());
		serviceDTO.setSource(serviceEntity.getSource());
		serviceDTO.setDeptTime(serviceEntity.getDeptTime());
		serviceDTO.setDest(serviceEntity.getDest());
		serviceDTO.setArrivalTime(serviceEntity.getArrivalTime());
		serviceDTO.setTravelMode(serviceEntity.getTravelMode());
		serviceDTO.setSeatsAvailable(serviceEntity.getSeatsAvailable());	
		serviceDTO.setShareMode(serviceEntity.getShareMode());
		serviceDTO.setPrice(serviceEntity.getPrice());
		return serviceDTO;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public String getDate() {
		return date;
	}



	public String getSource() {
		return source;
	}

	public String getDeptTime() {
		return deptTime;
	}

	public String getDest() {
		return dest;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public String getTravelMode() {
		return travelMode;
	}

	public Integer getSeatsAvailable() {
		return seatsAvailable;
	}

	public String getShareMode() {
		return shareMode;
	}

	public Integer getPrice() {
		return price;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public void setDate(String date) {
		this.date = date;
	}


	public void setSource(String source) {
		this.source = source;
	}

	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}

	public void setSeatsAvailable(Integer seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public void setShareMode(String shareMode) {
		this.shareMode = shareMode;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
