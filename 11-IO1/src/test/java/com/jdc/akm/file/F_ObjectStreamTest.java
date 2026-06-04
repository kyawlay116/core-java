package com.jdc.akm.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.jupiter.api.Test;

import com.jdc.akm.OwnerFile;

public class F_ObjectStreamTest extends OwnerFile {

	@Test
	void readAndWriteTest() {
		File file = getFile("buffer-data.txt");
		writeFile(file);
		readFile(file);

	}

	private void writeFile(File file) {
		try (ObjectOutputStream out = 
				new ObjectOutputStream(
						new FileOutputStream(file))) {
			
			Data d1 = new Data(40, "Andrew",500.01);
			out.writeObject(d1);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private void readFile(File file) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

			Data data = (Data) in.readObject();
			System.out.println(data);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

class Data implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3892568365282785515L;
	private int intValue;
	private String stringValue;
	private transient double doubleValue;

	public Data(int intValue, String stringValue,double doubleValue) {
		this.intValue = intValue;
		this.stringValue = stringValue;
		this.doubleValue = doubleValue;
	}

	@Override
	public String toString() {
		return "Double :: %.2f  Int :: %s".formatted(doubleValue, intValue);
	}

}