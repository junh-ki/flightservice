package com.jun.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jun.springcloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
