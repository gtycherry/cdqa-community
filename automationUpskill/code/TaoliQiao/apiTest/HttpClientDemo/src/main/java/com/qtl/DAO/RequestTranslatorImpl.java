package com.qtl.DAO;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by tlqiao on 2/18/16.
 */
public class RequestTranslatorImpl implements RequestTranslator {

 @Override
 public String transMobileInfo(HashMap<String,String> parameterMap)
 {  String templatePath="RequestTemplate/getWeather.xml";
	 return requestTranslate(parameterMap,templatePath);}
	@Override
	public String transGetWether(HashMap<String,String> parameterMap,String templatePath)
	{
		return requestTranslate(parameterMap,templatePath);
	}

	private String requestTranslate(HashMap<String,String> map,String templatePath)
	{
		VelocityContext velocityContext= new VelocityContext();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			velocityContext.put (entry.getKey(),entry.getValue());}
			StringWriter writer=new StringWriter();
			createVelocityEngine().mergeTemplate(templatePath,velocityContext,writer);
			return writer.toString();
	}

	private VelocityEngine createVelocityEngine (){
		Properties properties=new Properties();
		properties.setProperty("resource.loader","class");
		properties.setProperty("class.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		return new VelocityEngine(properties);
	}
}
