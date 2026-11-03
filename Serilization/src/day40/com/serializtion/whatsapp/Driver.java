package day40.com.serializtion.whatsapp;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		MessageSerialization msgser = new MessageSerialization();
		
		Message msg =  new Message("MSG!"," Hey whatsapp? ");
		
		msgser.serilizeMsg(msg);
	}
}
