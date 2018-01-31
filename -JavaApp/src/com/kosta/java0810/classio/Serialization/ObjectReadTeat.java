package com.kosta.java0810.classio.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReadTeat {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("person.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object ob = ois.readObject();
			
			Person p = (Person) ob; // p자식 = (자식)ob부모;
			System.out.println("이름: " + p.name);
			System.out.println("나이: " + p.age);
			System.out.println("직업: " + p.job);

			Person p2 = (Person) ois.readObject(); // p자식 = (자식)ob부모;
			System.out.println("이름: " + p2.name);
			System.out.println("나이: " + p2.age); 
			System.out.println("직업: " + p2.job);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
