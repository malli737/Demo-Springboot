package com.malli.SprinDemo.pojo;

public class Quoterresponse 
{
	private String type;
	private Quote value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Quoterresponse [type=" + type + ", value=" + value + "]";
	}
	public Quote getValue() {
		return value;
	}
	public void setValue(Quote value) {
		this.value = value;
	}

}
