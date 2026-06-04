package com.jdc.akm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class A_SetInterfaceTest {
	private Set<String> set;
	
	@Test
	void test() {
		
//		create HashSet object
		set = getSet("hash");
		
//		add Data to hashSet
		addData("William","Andrew","John","John");
		
//		remove date to  hashset
//		System.out.println("Set size : "+set.size());
		
//		set.remove("Andrew");
//		System.out.println("Set size : "+set.size());
//		set.remove("John");
//		set.remove("Andrew"); // Andrew already remove;
//		System.out.println("Set size : "+set.size());
		
//		show data from hashSet
		showData("Hash");
		
		set = getSet("link");
		addData("Myint","Aung","Kyaw","Myint");
		showData("link");
		
		set = getSet("tree");
		addData("DD","ZZ","EE","AA");
		showData("link");
	}
	
	void showData(String name) {
		System.out.println("== Collection FrameWork ==");
		System.out.println("=========== "+ name +" ============");
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("==========================");
	}
	
	// (...)varArgs can use as array and will be used in last args on
	void addData(String... strings) {
//		Set<String> set = getSet(name);
		for(String n : strings) {
			set.add(n);
		}
	}
	
	Set<String> getSet(String name){
		return switch(name) {
		case "hash" -> new HashSet<>();
		case "tree" -> new TreeSet<>();
		case "link" -> new LinkedHashSet<>();
		default -> null;
		};
	}

}
