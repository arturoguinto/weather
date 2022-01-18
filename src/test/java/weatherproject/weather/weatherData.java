package weatherproject.weather;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class weatherData {

	
	
	@Test
	public void GetWeatherDetails()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=71d8a79ed85c4ceeb512c1d8873d1228&include=minutely";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=71d8a79ed85c4ceeb512c1d8873d1228&include=minutely");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
	System.out.println("Response Body is =>  " + responseBody);

	}
	
	
	@Test
	public void GetWeatheronCities() {
		
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://api.weatherbit.io/v2.0/current?city_id&key=71d8a79ed85c4ceeb512c1d8873d1228";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/https://api.weatherbit.io/v2.0/current?city_id=8953360&key=71d8a79ed85c4ceeb512c1d8873d1228");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
		
	
	
	@Test
	public void GetAirQualityPostcode() {
		
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://api.weatherbit.io/v2.0/current/airquality?postal_code=27601&key=71d8a79ed85c4ceeb512c1d8873d1228";
		
		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "https://api.weatherbit.io/v2.0/current/airquality?postal_code=27601&key=71d8a79ed85c4ceeb512c1d8873d1228");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}

	
	
	
	

}