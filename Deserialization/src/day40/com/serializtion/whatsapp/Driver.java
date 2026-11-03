package day40.com.serializtion.whatsapp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {

	public static void main (String [] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fos =  new FileInputStream("/Users/shubhamchandrakar/Downloads/Kodewala/Serilization/message.ser");
		ObjectInputStream oos = new ObjectInputStream(fos);
		 Message message = (Message) oos.readObject();
		 
		 System.out.println(" Deser: " + message.getMessage());
		 oos.close();
	}
}

