package com.qtl.Service;

import org.springframework.util.xml.SimpleNamespaceContext;
import org.xml.sax.InputSource;

import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;
import java.util.HashMap;

/**
 * Created by tlqiao on 2/23/16.
 */
public class XMLUtil {
	public String getXMLValue(String inputString ,String expression)
	{
		try
		{
			InputSource inputSource=new InputSource(new StringReader(inputString));
			XPath xPath= XPathFactory.newInstance().newXPath();
			SimpleNamespaceContext simpleNamespaceContext=new SimpleNamespaceContext();
			simpleNamespaceContext.bindNamespaceUri("NS1","http://www.webserviceX.NET");
			xPath.setNamespaceContext(simpleNamespaceContext);
			String s=xPath.evaluate(expression, inputSource);

		return s;}
		catch(Exception e)
		{e.printStackTrace();}
		return null;
	}

}
