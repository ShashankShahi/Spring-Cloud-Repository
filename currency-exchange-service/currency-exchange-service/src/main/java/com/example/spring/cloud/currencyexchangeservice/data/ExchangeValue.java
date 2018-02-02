package com.example.spring.cloud.currencyexchangeservice.data;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class ExchangeValue {
	
	@Id
	private long id;
	@Column(name="from_currency")
	private String from;
	@Column(name="to_currency")
	private String to;
	private BigInteger conversionMultiple;
	private int port;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ExchangeValue(long id, String from, String to, BigInteger conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	
	public ExchangeValue() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigInteger getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigInteger conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	

}
