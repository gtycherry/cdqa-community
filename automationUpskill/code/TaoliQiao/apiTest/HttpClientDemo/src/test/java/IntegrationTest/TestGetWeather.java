package IntegrationTest;

/**
 * Created by tlqiao on 3/18/16.
 */

import com.qtl.DAO.GetAPIResponse;
import com.qtl.Service.ParseGetWeatherRes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:applicationContext.xml"
})
public class TestGetWeather {
	@Autowired
	GetAPIResponse getAPIResponse;
	@Autowired
	ParseGetWeatherRes parseGetWeatherRes;


	@Test
	public void getWeatherInfo() {
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		String templatePath= "/RequestTemplate/getWeather.xml";
		parameterMap.put("CityName", "Shanghai");
		parameterMap.put("CountryName","China");
		String response = getAPIResponse.getWeather(parameterMap, templatePath);
		String weatherInfo =parseGetWeatherRes.getWeatherResult(response);
		System.out.println("The information of weather[Shanghai-China] is" + weatherInfo);


		parameterMap.put("CityName", "Chengdu");
		parameterMap.put("CountryName","");
		response = getAPIResponse.getWeather(parameterMap, templatePath);
		 weatherInfo = parseGetWeatherRes.getWeatherResult(response);
		System.out.println("\n");
		System.out.println("The information of weather[Chengdu-]is" + weatherInfo);

	}

}
