package com.jdc.akm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class _CollectionTest {

	private List<String> list;
	private Set<String> set;
	
	@SuppressWarnings("unchecked")
	void addCollection(Collection<String> col,String name) {
		if(col instanceof List<String> list) {
			list = getList(name);
			this.list = list;
		}else if(col instanceof Set<String> set) {
			set = (Set<String>) getList(name);
			this.set = set;
		}
	}
	
	void addData(Collection<String> col, String...strings) {
		for(String n : strings) {
			col.add(n);
		}
	}
	
	List<String> getList(String name){
		return switch(name) {
		case "array" -> new ArrayList<>();
		case "tree" -> new LinkedList<>();
		case "link" -> new LinkedList<>();
		default -> null;
		};
	}
}
