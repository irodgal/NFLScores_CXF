package com.irodgal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/*
	 * public static void main(String[] args) {
	 * JUnitCore.main("grupoPrueba.artifactPrueba.App"); }
	 */
	@Test
	public void getNFLWebOutputTest() {
		App app = new App();
		String output = "";
		try {
			output = app.getNFLWebPageOutput();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(output);
		// assertThat(output, equalTo("hola"));
		assertTrue(output.contains("<title>NFL.com - Official Site of the National Football League</title>"));
		assertTrue(output.contains("hd-scorestrip"));
		assertTrue(output.contains("yui3-scorestrip-tile-clock"));

	}

	@Test
	public void getNFLWebScoresOutputTest() {
		App app = new App();
		String output = "";
		try {
			output = app.getNFLWebScoresOutput();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(output);
		// assertThat(output, equalTo("hola"));

	}
}
