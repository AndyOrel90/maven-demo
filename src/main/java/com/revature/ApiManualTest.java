package com.revature;

public class ApiManualTest {

	public static void main(String[] args) {
		Api testApi = new Api();
		testApi.set("testValue");
		String result = testApi.get();
		if (result.equals("testValue")) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
	}
}
