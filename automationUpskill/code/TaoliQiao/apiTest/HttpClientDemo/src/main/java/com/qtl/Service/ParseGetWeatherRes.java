package com.qtl.Service;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tlqiao on 3/18/16.
 */
public class ParseGetWeatherRes {
	@Autowired
	XMLUtil xmlUtil;


	public String getWeatherResult(String inputString)
	{  String expression="//NS1:GetWeatherResult";
	   return	xmlUtil.getXMLValue(inputString,expression);
	}

}
