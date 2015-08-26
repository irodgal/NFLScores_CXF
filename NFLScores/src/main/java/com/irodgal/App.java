package com.irodgal;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	// @SuppressWarnings("static-access")
	public String getNFLWebPageOutput() throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// InputStream instream = null;

		try {
			HttpGet httpget = new HttpGet("http://www.nfl.com/");

			// System.out.println("Executing request " +
			// httpget.getRequestLine());
			CloseableHttpResponse response = httpclient.execute(httpget);
			try {
				// System.out.println("----------------------------------------");
				// System.out.println(response.getStatusLine());

				// Get hold of the response entity
				HttpEntity entity = response.getEntity();

				// System.out.println(EntityUtils.toString(entity));
				return EntityUtils.toString(entity);

				// If the response does not enclose an entity, there is no need
				// to bother about connection release
				/*
				 * if (entity != null) { instream = entity.getContent(); try {
				 * instream.read(); // do something useful with the response
				 * 
				 * } catch (IOException ex) { // In case of an IOException the
				 * connection will be // released // back to the connection
				 * manager automatically throw ex; } finally { // Closing the
				 * input stream will trigger connection // release
				 * instream.close(); } }
				 */
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}

		// return instream;
	}

	public String getNFLWebScoresOutput() throws Exception {
		// http://www.nfl.com/liveupdate/scorestrip/ss.xml?random=1440494159650

		CloseableHttpClient httpclient = HttpClients.createDefault();

		try {
			HttpGet httpget = new HttpGet(
					"http://www.nfl.com/liveupdate/scorestrip/ss.xml");

			// System.out.println("Executing request " +
			// httpget.getRequestLine());
			CloseableHttpResponse response = httpclient.execute(httpget);
			try {
				// System.out.println("----------------------------------------");
				// System.out.println(response.getStatusLine());

				// Get hold of the response entity
				HttpEntity entity = response.getEntity();

				// System.out.println(EntityUtils.toString(entity));
				return EntityUtils.toString(entity);

				// If the response does not enclose an entity, there is no need
				// to bother about connection release
				/*
				 * if (entity != null) { instream = entity.getContent(); try {
				 * instream.read(); // do something useful with the response
				 * 
				 * } catch (IOException ex) { // In case of an IOException the
				 * connection will be // released // back to the connection
				 * manager automatically throw ex; } finally { // Closing the
				 * input stream will trigger connection // release
				 * instream.close(); } }
				 */
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}
	}
}
