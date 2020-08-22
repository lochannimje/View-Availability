package com.travel.view_availability.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;



@Entity
@Table(name="service")
public class ServiceEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "service_id", nullable = false)
	private Integer serviceId;
	@Column(nullable = false, length = 10)
	private String date;
	@Column(nullable = false, length = 50)
	private String source;
	@Column(name= "dept_time",nullable = false, length = 10)
	private String deptTime;
	@Column(nullable = false, length = 50)
	private String dest;
	@Column(name= "arrival_time",nullable = false, length = 10)
	private String arrivalTime;
	@Column(name="travel_mode",nullable = false, length = 5)
	private String travelMode;
	@Column(name="seats_available",nullable = false)
	private Integer seatsAvailable;
	@Column(name="share_mode",nullable = false, length = 10)
	private String shareMode;
	@Column(nullable = false)
	private Integer price;
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