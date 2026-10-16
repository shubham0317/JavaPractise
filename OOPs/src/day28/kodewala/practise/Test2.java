package day28.kodewala.practise;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb =  new StringBuffer("Shubham");
		System.out.println(sb.capacity());
		System.out.println(sb.delete(1, 3));
		System.out.println(sb.deleteCharAt(1));
	    sb.ensureCapacity(45);
	    
	    StringBuffer sb1 =  new StringBuffer("Kodewala Academy");
	    System.out.println(sb1.insert(1, 'e'));
	    System.out.println(sb1.append(" is very good institue"));
	    System.out.println(sb1);
	}
}
