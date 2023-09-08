
package com.VisualIt.Policy.Exceptions;

public class ErrorResponse {

	/*public static final String CUSTOMER_ALL_READY_EXISTED = "this Customer All Ready Existed";
	public static final String CUSTOMER_GET_Id_Not_Found = "this Getcustomer id is Not found";
	public static final String CUSTOMER_DELETE_ID_NOT_FOUND = "this Deletcustomer id is Not found";
	public static final String CUSTOMER_UPDATE_ID_NOT_FOUND = "this Updatecustomer id is Not found";*/

	private String message;

	private String msgdetails;

	public ErrorResponse() {
		super();
	}

	public ErrorResponse(String message, String msgdetails) {
		super();
		this.message = message;
		this.msgdetails = msgdetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMsgdetails() {
		return msgdetails;
	}

	public void setMsgdetails(String msgdetails) {
		this.msgdetails = msgdetails;
	}

}
