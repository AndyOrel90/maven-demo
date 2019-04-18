package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class ApiTest {
	Api apiTest;
	
	@Before
	public void setup() {
		apiTest = new Api();
	}

	@Test
	public void testGet() {
		apiTest.set("testValue");
		String expectedResult = "testValue";
		String actualResult = apiTest.get();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test (expected = IOException.class)
	public void testForError() throws IOException {
		apiTest.error();
	}

	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testScannerSet() {
		Scanner sc = new Scanner("textValue");
		apiTest.scannerSet(sc);
		assertEquals("textValue", apiTest.get());
	}
}
