package kodewala.day42.netflix;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NetflixApplication  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		List<Movie> movieList = new ArrayList();
		
		
		movieList.add(new Movie("MOV1","Inception",2.30f,1.30f));
		movieList.add(new Movie("MOV2","GolMal",2.50f,1.40f));
		movieList.add(new Movie("MOV3","Welcome",2.35f,1.3f));
		
		
		NetflixUser user =  new NetflixUser("USER1","Shubham","1234","user@gmail.com");
		user.setWatchHistory(movieList);
		
		
		WatchHistoryService history = new WatchHistoryService();
		history.saveWatchHistory(user);
		
		NetflixUser us2 = history.loadWatchHistory("WatheHistory.ser");
	   
		System.out.println("User ID: " + us2.getUserId());
		System.out.println("User Name: " + us2.getUserName());
		System.out.println("User password: " + us2.getPassword());
		
		System.out.println("Movie WatchHistory");
		
		for (Movie m : us2.getWatchHistory()) {
			System.out.println(m.getMovieName());
			System.out.println("Watched: " + m.getWatchDuration() + " hrs / " + m.getDuration() + " hrs");
			System.out.println("--------------------------------");
		}
	}
}
