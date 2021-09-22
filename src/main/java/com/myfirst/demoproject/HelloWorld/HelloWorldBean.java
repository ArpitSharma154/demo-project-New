package com.myfirst.demoproject.HelloWorld;

public class HelloWorldBean {
	
	String Message;
	
	public HelloWorldBean(String Message)
	{
		this.Message = Message;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [Message=" + Message + "]";
	}
	
	

}
