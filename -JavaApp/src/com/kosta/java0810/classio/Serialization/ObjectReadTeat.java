package com.kosta.java0810.classio.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReadTeat {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("person.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object ob = ois.readObject();
			
			Person p = (Person) ob; // p�ڽ� = (�ڽ�)ob�θ�;
			System.out.println("�̸�: " + p.name);
			System.out.println("����: " + p.age);
			System.out.println("����: " + p.job);

			Person p2 = (Person) ois.readObject(); // p�ڽ� = (�ڽ�)ob�θ�;
			System.out.println("�̸�: " + p2.name);
			System.out.println("����: " + p2.age); 
			System.out.println("����: " + p2.job);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
