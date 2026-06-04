package com.jdc.akm;

import java.io.File;
import java.io.IOException;

public class OwnerFile {
	
	private File file;
	
	protected File getFile(String name) {
		return createFile(name);
	}

	
	private File createFile(String name) {
		try {
			File path = new File("./testing");
			path.mkdir();
			
			file = new File(path, name);
			
			if(!file.exists()) {
				file.createNewFile();
			}
			return file;
		
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
