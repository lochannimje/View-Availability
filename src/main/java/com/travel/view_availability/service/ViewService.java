package com.travel.view_availability.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.travel.view_availability.dto.ServiceDTO;
import com.travel.view_availability.entity.ServiceEntity;
import com.travel.view_availability.model.Message;
import com.travel.view_availability.repository.ServiceRepository;




@Service
public class ViewService {
	

	@Autowired
	ServiceRepository serviceRepository;
	
	public List<ServiceEntity> getServiceDetailsDate(String date)  {
		return serviceRepository.findByDate(date);
	}
	
	public List<ServiceEntity> getServiceDetailsTravel(String travelMode) {
		return serviceRepository.findByTravelMode(travelMode);
	}
	
	public List<ServiceEntity> getServiceDetailsShare(String shareMode) {
		return serviceRepository.findByShareMode(shareMode);
	}
	
	public List<ServiceEntity> getServiceDetailsSource(String source) {
		return serviceRepository.findBySource(source);
	}
	public List<ServiceEntity> getServiceDetailsDest(String dest) {
		return serviceRepository.findByDest(dest);
	}
	public List<ServiceEntity> getServiceDetailsSeats(Integer seatsAvailable) {
		return serviceRepository.findBySeatsAvailable(seatsAvailable);
	}
	
	public ServiceDTO getService(Integer serviceId) {
		ServiceEntity e=serviceRepository.findByServiceId(serviceId);
		ServiceDTO d=ServiceDTO.valueOf(e);
		return d;
		
		
	}
}
	
