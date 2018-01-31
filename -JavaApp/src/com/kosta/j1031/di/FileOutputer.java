package com.kosta.j1031.di;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileOutputer implements Outputer{
	ObjectOutputStream oos;
	
	public FileOutputer() {
			try {
				oos = new ObjectOutputStream(new FileOutputStream("hello.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Override
	public void helloPrint(String name) {
		try {
			oos.writeBytes(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
