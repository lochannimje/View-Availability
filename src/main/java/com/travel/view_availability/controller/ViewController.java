package com.travel.view_availability.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.MediaType;


import org.springframework.web.bind.annotation.RestController;

import com.travel.view_availability.dto.ServiceDTO;
import com.travel.view_availability.entity.ServiceEntity;
import com.travel.view_availability.model.Message;
import com.travel.view_availability.service.ViewService;





@RestController
@CrossOrigin
public class ViewController {
	



	@Autowired
	ViewService viewService;
	

	@GetMapping("/service/{keyword}")
    public Object searchProducts(@PathVariable(name = "keyword") String keyword) {
  
        List<ServiceEntity> result = viewService.getServiceDetailsDate(keyword);
        result.addAll(viewService.getServiceDetailsTravel(keyword));
        result.addAll(viewService.getServiceDetailsShare(keyword));
        result.addAll(viewService.getServiceDetailsSource(keyword));
        result.addAll(viewService.getServiceDetailsDest(keyword));

        if (result.isEmpty()) {
            Message msg = new Message();
            msg.setMessage("No Travel Service available for this keyword");
            return msg;
        }

        return result;
    }
	

	@GetMapping(value="/{serviceId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ServiceDTO getService(@PathVariable Integer serviceId) {
		ServiceDTO s=viewService.getService(serviceId);
		return s;
	}
	
	
	
	@GetMapping("/service/trip/{source}")
    public Object searchProductsTrip(@PathVariable String source) {

        List<ServiceEntity> result = viewService.getServiceDetailsSource(source);
        
 
        if (result.size() == 0) {
            Message msg = new Message();
            msg.setMessage("No products are available with that keyword");
            return msg;
        }

        return result;
    }
	
	
	

	@GetMapping("/service/seats/{number}")
    public Object searchProductsInt(@PathVariable(name = "number") Integer number) {
        if (number>0 && number<7) {
	        List<ServiceEntity> result = viewService.getServiceDetailsSeats(number);
	   
	        if (result.size() == 0) {
	            Message msg = new Message();
	            msg.setMessage("No products are available with that keyword");
	            return msg;
	        }
	
	        return result;
        }
        Message msg = new Message();
        msg.setMessage("Number should be between 1 and 6");
        return msg;
        
        
    }
	
	
	
}
