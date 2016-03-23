package com.qtl.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * Created by tlqiao on 2/18/16.
 */
public class GetAPIResponseImpl implements GetAPIResponse {
	@Autowired
	HttpClientDAO httpClientDAO;
	@Autowired
	RequestTranslator requestTranslator;

	@Override
	public String getMobileInfo(HashMap<String,String> parameterMap)
	{
		return  httpClientDAO.getResponseForPost(requestTranslator.transMobileInfo(parameterMap));

	}
	public String getWeather(HashMap<String,String> parameterMap, String templatePath)
	{
		return httpClientDAO.getResponseForPost(requestTranslator.transGetWether(parameterMap,templatePath));
	}
}
