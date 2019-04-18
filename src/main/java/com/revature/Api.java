package com.revature;

import java.io.IOException;
import java.util.Scanner;

public class Api {
	private String value;
	
	public String get() {
		return this.value;
	}
	
	public String set(String value) {
		this.value = value;
		return this.value;
	}
	
	public void scannerSet(Scanner sc) {
		this.value = sc.nextLine();
	}
	
	public void error() throws IOException {
		throw new IOException();
	}
	
}
