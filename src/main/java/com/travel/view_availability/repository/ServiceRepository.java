package com.travel.view_availability.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.view_availability.entity.ServiceEntity;




	
public interface ServiceRepository extends JpaRepository<ServiceEntity, Integer> {
	
	
	List<ServiceEntity> findByDate(String date);
	List<ServiceEntity> findByTravelMode(String travelMode);
	List<ServiceEntity> findByShareMode(String shareMode);
	List<ServiceEntity> findBySource(String source);
	List<ServiceEntity> findByDest(String dest);
	List<ServiceEntity> findBySeatsAvailable(Integer seatsAvailable);
	ServiceEntity findByServiceId(Integer serviceId);



}
