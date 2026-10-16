package day27.hotstar.user;

public class User {
      String userId;
      String userName;
      String type;
      public static int  liveUserCount = 0;
      
      public User(String userId, String userName, String type) {
    	  super();
    	  this.userId = userId;
    	  this.userName = userName;
    	  this.type = type;
      }

	  public User(String userName, String type) {
		super();
		this.userName = userName;
		this.type = type;
	  }
     
	  {
		  liveUserCount += 1;
	  }
}
