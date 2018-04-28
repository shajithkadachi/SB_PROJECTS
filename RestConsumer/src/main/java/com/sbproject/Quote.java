package com.sbproject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
public class Quote {
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	private String type;
    private Value value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Quote [type=" + type + ", value=" + value + "]";
	}
    
    
}
