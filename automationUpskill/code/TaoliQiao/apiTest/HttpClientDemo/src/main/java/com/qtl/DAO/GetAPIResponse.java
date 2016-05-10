package com.qtl.DAO;

import java.util.HashMap;

/**
 * Created by tlqiao on 2/18/16.
 */
public interface GetAPIResponse {
	public String getMobileInfo(HashMap<String,String> parameterMap);
	public String getWeather(HashMap<String,String> parameterMap,String templatePath);
}
