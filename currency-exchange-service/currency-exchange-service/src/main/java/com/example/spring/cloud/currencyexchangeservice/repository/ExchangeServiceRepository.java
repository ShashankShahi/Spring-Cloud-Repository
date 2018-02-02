package com.example.spring.cloud.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.cloud.currencyexchangeservice.data.ExchangeValue;

public interface ExchangeServiceRepository extends JpaRepository<ExchangeValue, Long>{
	
 ExchangeValue findByFromAndTo(String from,String to);
}
