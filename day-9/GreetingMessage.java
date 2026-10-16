class GreetingMessage {

    public static void main(String[] args) {
	
	  String name = args[0];
	  String time = args[1];
	  
	  if(time.equals("Morning")) {
	   morningGreeting(name);
	  } else if(time.equals("Afternoon")) {
	    afternoonGreeting(name);
	  } else if(time.equals("Evening")) {
	    eveGreeting(name);
	  } else {
	   System.out.println("Thanks " + name + " for visiting our site");
	  }
	  
	
	}
	
	static void  morningGreeting(String userName) {
	  System.out.println("Good morning " + userName);
	}
	static void  afternoonGreeting(String userName) {
	  System.out.println("Good Afternoon " + userName);
	}
	static void  eveGreeting(String userName) {
	  System.out.println("Good Evening " + userName);
	}

}