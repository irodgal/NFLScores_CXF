package com.irodgal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private static App app;

	@BeforeClass
	public static void setUp() {
		app = new App();
	}

	@Test
	public void getNFLWebOutputAsStringTest() {
		String output;
		try {
			output = app.getNFLWebOutputAsString();
			// assertThat(output, equalTo("hola2"));
			assertThat(output,
					containsString("<title>NFL.com - Official Site of the National Football League</title>"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void getNFLScorestripOutputAsStringTest() {
		String output;
		try {
			output = app.getNFLScorestripOutputAsString();
			assertThat(output, containsString("<ss>"));
			assertThat(output, containsString("</ss>"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}