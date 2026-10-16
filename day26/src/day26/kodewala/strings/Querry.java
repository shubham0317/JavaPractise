package day26.kodewala.strings;

public class Querry {
      public static void main(String[] args) {
    	  SearchQuerry q1 = new SearchQuerry();
    	  System.out.println(q1.generateQuerry(1000, null));
    	  System.out.println(q1.generateQuerry(0, "s1"));
    	  System.out.println(q1.generateQuerry(0, null));
    	  System.out.println(q1.generateQuerry(1000, "s3"));
      }
}
