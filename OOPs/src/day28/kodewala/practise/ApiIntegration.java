package day28.kodewala.practise;

public class ApiIntegration {

	public static void main(String[] args) {
		StringBuilder response = new StringBuilder();
		
		response.append(" {\"status\": \"success\",");
		response.append("\"data\": {\"id\": 123, \"name\": \"John\" } } ");
		
		System.out.println(response.toString());
	}
}
