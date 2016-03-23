package com.qtl.DAO;

import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tlqiao on 2/18/16.
 */
public class HttpClientDAO {
	@Autowired
	private DefaultHttpClient httpClient;
	@Autowired
	private HttpPost httpPost;
	@Autowired
	private CredentialsProvider credentialsProvider;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String userName;
	private String passWord;
	private String url;



	public String getResponseForPost(String requestBody) {
		try {
			httpPost = createHttpPost(url);
			httpPost.setEntity(new StringEntity(requestBody));
			HttpResponse httpResponse = httpClient.execute(httpPost, createHttpClientContext(userName, passWord));
			return EntityUtils.toString(httpResponse.getEntity());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//httpClient.getConnectionManager().shutdown();
		}
		return null;
	}

	private HttpPost createHttpPost(String url) {
		httpPost=new HttpPost(url);
		httpPost.setHeader("Content-Type", "text/xml;charset=utf-8");
		return httpPost;
	}

	private HttpClientContext createHttpClientContext(String userName, String passWord) {
		HttpClientContext context = HttpClientContext.create();
		credentialsProvider.setCredentials(new AuthScope(AuthScope.ANY), new UsernamePasswordCredentials(userName, passWord));
		context.setCredentialsProvider(credentialsProvider);
		return context;
	}


}


