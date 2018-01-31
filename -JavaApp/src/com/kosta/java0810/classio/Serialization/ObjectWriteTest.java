package com.kosta.java0810.classio.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {
	
	public ObjectWriteTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		try {
			//IOException에 대한 예외처리가 필요한 class		//FileNotFoundException에 대한 예외처리가 필요한 class
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
			Person p = new Person();
			oos.writeObject(p);
			
			Person p2 = new Person();
			p2.name = "길라임";
			p2.age = 17;
			p2.job = "학생";
			
			oos.writeObject(p2);
			
			//NotSerializableException 발생시 writeObject의 대상이 되는 class가 Serializable interface를 implements하고 있는지 확인
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
