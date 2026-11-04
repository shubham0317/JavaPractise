package kodewala.day42.netflix;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NetflixUser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String userName;
	private String email;
	private transient String password;
	private List <Movie> watchHistory;
	
	public NetflixUser(String userId, String userName, String email,String password) {
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.watchHistory = new ArrayList<Movie>();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Movie> getWatchHistory() {
		return watchHistory;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setWatchHistory(List<Movie> watchHistory) {
		this.watchHistory = watchHistory;
	}

	@Override
	public String toString() {
		return "NetflixUser [userId=" + userId + ", userName=" + userName + ", email=" + email + ", watchHistory="
				+ watchHistory + "]";
	}
	

}
