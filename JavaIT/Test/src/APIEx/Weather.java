package APIEx;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpRetryException;

import javax.xml.bind.JAXBElement;

public class Weather {

	public static void main(String[] args) {
		
//		HttpContextpClient httpClient = new DefaultHttpClient();
//		HttpRetryExceptionttpGet httpGet = new HttpGet("http://api.openweathermap.org/data/2.5/weather?q=Seoul,kr&APPID=80c41b510fa65b7c971134ddfdd3b86a");
//		
//		try {
//		HttpRetryExceptionesponse response = httpClient.execute(httpGet);
//		System.out.println(response.getStatusLine().getStatusCode()); 
//		
//		InputStream jsonInput  = response.getEntity().getContent(); 
//		
//		JsonParser parser = new JsonParser();
//		JAXBElement element = parser.parse(new InputStreamReader(jsonInput, "UTF-8"));
//		
//		System.out.println(element.getAsJsonObject().get("main").getAsJsonObject().get("temp").getAsFloat()-273.15);
//		} catch (IOException e) {
//		 e.printStackTrace();
//		        }
		}

}
