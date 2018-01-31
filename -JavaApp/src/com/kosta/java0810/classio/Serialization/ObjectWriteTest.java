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
			//IOException�� ���� ����ó���� �ʿ��� class		//FileNotFoundException�� ���� ����ó���� �ʿ��� class
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
			Person p = new Person();
			oos.writeObject(p);
			
			Person p2 = new Person();
			p2.name = "�����";
			p2.age = 17;
			p2.job = "�л�";
			
			oos.writeObject(p2);
			
			//NotSerializableException �߻��� writeObject�� ����� �Ǵ� class�� Serializable interface�� implements�ϰ� �ִ��� Ȯ��
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
