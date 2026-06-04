package com.jdc.akm;

import java.awt.FontFormatException;

public class C_ThrowWithCheckHandler extends _Main{
	
	public static void main(String[] args) {
		try{
			methodOne();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void methodOne() throws Exception{
		System.out.println("Use Method One");
		methodWithChecked();
		methodWithUnChecked();
	}
	
	// Convert unchecked to checked exception
	static void methodWithUnChecked() throws Exception{
		System.out.println("Use Unchecked");
		withUnchecked();
	}
	
	static void methodWithChecked() throws FontFormatException{
		System.out.println("Use Checked");
		withChecked("method checked");
	}
}
