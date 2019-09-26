package com.virtusa.helper;

public enum RequestType {
	NAME("name"), CONTACT("contact"), SALARY("salary");
	private String val;

	private RequestType(String val) {
		this.val = val;
	}

	public String getval() {
		return val;
	}

}
