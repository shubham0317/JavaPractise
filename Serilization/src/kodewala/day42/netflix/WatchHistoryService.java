package kodewala.day42.netflix;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WatchHistoryService {

	public void saveWatchHistory(NetflixUser user) throws IOException {
		
		FileOutputStream fos =  new FileOutputStream("WatheHistory.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.close();
		System.out.println("Successfully saved watch history...");
	}
	
	
	
	public NetflixUser loadWatchHistory(String pathName) throws IOException, ClassNotFoundException {
		
		FileInputStream fis =  new FileInputStream(pathName);
		ObjectInputStream oos = new ObjectInputStream(fis);
		
		NetflixUser user = (NetflixUser) oos.readObject();
		System.out.println("Successfully loaded watch history...");
		return user;
	}
	
}
