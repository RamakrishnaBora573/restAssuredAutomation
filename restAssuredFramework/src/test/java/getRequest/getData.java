package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getData {

	@Test
	public void testResposeCode()
	{
		int statuscode = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();		
		
		System.out.println("Status Code"+statuscode);
		
		Assert.assertEquals(statuscode,200);
		
	}
	@Test
	public void testResponceBody()
	{
		String body = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		long time = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		
		System.out.println("Response Body : "+body);
		
		System.out.println("Responce Time : "+time);
		
	}
	
	
}
