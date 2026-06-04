package com.jdc.akm;

import java.awt.FontFormatException;

public class _Main {
	
	static void withChecked(String font) throws FontFormatException{
		System.out.println("Starting withChecked method");
		throw new FontFormatException(font);
//		check Exception throw pyit yin call method mhr handle lote ya tal
		
	}
	static void withUnchecked() throws RuntimeException{
		System.out.println("Starting withUnChecked method");
		throw new RuntimeException();
	}

}
