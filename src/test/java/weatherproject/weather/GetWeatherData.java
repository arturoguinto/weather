package weatherproject.weather;



import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetWeatherData {
	@Test
	public void getRequests()
	{
		given().
		when().get("https://api.weatherbit.io/v2.0/current?city_id=8953360&key=71d8a79ed85c4ceeb512c1d8873d1228").
		
		then().assertThat().statusCode(200);
		
		
	}
}
	
	

