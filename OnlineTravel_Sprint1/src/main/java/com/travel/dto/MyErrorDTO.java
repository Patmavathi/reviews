package com.travel.dto;

import org.springframework.stereotype.Component;

@Component
public class MyErrorDTO implements MyDTO{
	
	private String errorMsg;

	public MyErrorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyErrorDTO(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "MyErrorDTO [errorMsg=" + errorMsg + "]";
	}
	
	

}
