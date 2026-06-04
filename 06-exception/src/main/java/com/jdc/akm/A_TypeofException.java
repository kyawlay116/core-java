package com.jdc.akm;

import java.io.File;
import java.io.IOException;

public class A_TypeofException {
	
	public static void main(String[] args) {
		unchecked();
	}
	
	// Arithmentic (unchecked)
	static void unchecked() {
		int a = 0;
		int b = 10 / a;
	}
	
	// CheckException
	static void checked() throws IOException{
		File f = new File("~/Users/kyawl/text.txt");
		//f.createNewFile();
	}
	
	// StackOverFlowError
	static int getOpeOne(int a) {
		return getOpeTwo(a);
	}
	
	static int getOpeTwo(int a) {
		return 10;
	}
}
