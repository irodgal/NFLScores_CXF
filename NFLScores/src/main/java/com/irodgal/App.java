package com.irodgal;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public String getNFLWebOutputAsString() throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet("http://www.nfl.com");

			CloseableHttpResponse response = httpclient.execute(httpget);
			try {
				// Get hold of the response entity
				HttpEntity entity = response.getEntity();

				return EntityUtils.toString(entity);
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}
	}

	public String getNFLScorestripOutputAsString() throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet("http://www.nfl.com/liveupdate/scorestrip/ss.xml");

			CloseableHttpResponse response = httpclient.execute(httpget);
			try {
				// Get hold of the response entity
				HttpEntity entity = response.getEntity();

				return EntityUtils.toString(entity);
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}
	}
}