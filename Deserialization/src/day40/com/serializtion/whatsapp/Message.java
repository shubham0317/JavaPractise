package day40.com.serializtion.whatsapp;

import java.io.Serializable;

public class Message implements Serializable{

	private static final long serialVersionUID = 1L;
	private String msgId;
	private String message;
	
	
	public Message(String msgId, String message) {
		this.msgId = msgId;
		this.message = message;
	}


	public String getMsgId() {
		return msgId;
	}


	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
}
