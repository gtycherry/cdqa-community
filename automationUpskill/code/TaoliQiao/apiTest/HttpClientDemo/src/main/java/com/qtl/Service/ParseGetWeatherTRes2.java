package com.qtl.Service;

import com.sun.org.apache.xml.internal.utils.NameSpace;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;

/**
 * Created by tlqiao on 3/20/16.
 */
public class ParseGetWeatherTRes2 {
	Document document;
	public void initial(String inputString)
	{
		try {
			document= DocumentHelper.parseText(inputString);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getWeatherInfo()
	{
		NameSpace nameSpace=new NameSpace("NS1","http://www.webserviceX.NET");

		return document.valueOf("//NS1:GetWeatherResult");
	}

}
