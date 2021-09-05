package com.jun.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jun.springcloud.model.Flight;
import com.jun.springcloud.repos.FlightRepository;

@RestController
public class FlightRestController {
	
	@Autowired
	private FlightRepository repo;
	
	@RequestMapping(value="/flights", method=RequestMethod.GET)
	public List<Flight> findFlights() {
		return repo.findAll();
	}
	
}
