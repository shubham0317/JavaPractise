package day26.kodewala.strings;

public class Driver2 {

	public static void main(String[] args) {
		
		/*
		 * String buffer are immutable
		   * There will be three object created
		   * scp --> "kodewala" , " Academey"
		   * heap = "Kodewala Academy";
		   */
		
		  StringBuilder sb = new StringBuilder(" Kodwewala");
		  sb.append(" Academy");
		  
		  System.out.println(sb);
		  
		  
	}

}
