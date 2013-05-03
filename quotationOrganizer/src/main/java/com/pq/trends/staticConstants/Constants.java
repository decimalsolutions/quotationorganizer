package com.pq.trends.staticConstants;



public class Constants {
	private Constants(){
		
	}
	public static final String USER_KEY = "rajeev";
	
	
	
	
	
	/*
	 * INTERCEPTOR CONSTANTS
	 */
	
	public static final String INTERCEPTOR_PREHANDLE = "Invoice before handler method is envoked. returns true/false. true: execution chain will be continued. This will lead to  another intercptor or handler method.";
	public static final String INTERCEPTOR_POSTHANDLER= "Invoced after the handler method is executed. ModelAndView object can be modified here. No return value";
	public static final String INTERCEPTOR_AFTERCOMPLETION="This method gets invoked when request gets processed and view is rendered. This will be for any type of situation even if there is any exception thrown. (This is same like we have finally block in Java";

}
