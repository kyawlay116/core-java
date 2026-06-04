package com.jdc.akm;

import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class B_TryCatchHandler {
	
	public static void main(String[] args) {
		String res = useTryWithFinally();
		System.out.println(res);
	}
	
	static class Scan implements AutoCloseable{
		@Override
		public void close(){}
	}
	
	static void useTryWithResource() {
		try(Scanner sc = new Scanner(System.in);
				Scan ss = new Scan()) {
			
			String s = sc.next();
			System.out.println("Before invoking check");
			
			withChecked("font error");
			withUnchecked();
			
			System.out.println("After invoking check");
			
		}catch(FontFormatException | RuntimeException e) {
			System.out.println("Catch block process");
			
		}
	}
	
	
	static String useTryWithFinally() {
		try {
			System.out.println("Before invoking check");
			
			withChecked("font error");
			withUnchecked();
			
			System.out.println("After invoking check");
			return "Try block";
			
		}catch(FontFormatException | RuntimeException e) {
			System.out.println("Catch block process");
			return "Catch block";
			
		}finally {
			System.out.println("Finally");
		}
	
	}
	
	static void useTryMultiCatch() {
		try {
			System.out.println("Before invoking check");
			File f = new File("");
			f.createNewFile();
			withChecked("font error");
			withUnchecked();
			
			System.out.println("After invoking check");
			// different type of object can use
//		}catch(FontFormatException | IOException | RuntimeException e) {
		}catch (FontFormatException e) {
			System.out.println("Catch block process with fontformatException");
			
		}catch(RuntimeException e) {
			System.out.println("Catch block process with fontformatException");
		}catch(IOException e) {
			System.out.println("Catch block process with fontformatException");
		}
		
	}
	
	
	static void useTryCatch() {
		try {
			System.out.println("Before invoking check");
			withChecked("font error");
			withUnchecked();
			
			System.out.println("After invoking check");
			
		}catch(FontFormatException e) {
			System.out.println("Catch block process");
		}
	}
	
	static void withChecked(String font) throws FontFormatException{
		System.out.println("Starting withChecked method");
//		throw new FontFormatException(font);
//		check Exception throw pyit yin call method mhr handle lote ya tal
		
	}
	static void withUnchecked() throws RuntimeException{
		System.out.println("Starting withUnChecked method");
//		throw new RuntimeException();
	}
}
