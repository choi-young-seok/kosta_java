package com.kosta.java0726;

public class StringConvertTest {//���ڿ� ��ȯ �׽�Ʈ
	
	public void convert1(){ //�ΰ��� �������ڿ��� +������ �̿��Ͽ� �ռ�
		String s1 = "�츮����";
		String s2 = "���ѹα�����~!";
		s1 += s2; //+������ ���� ���Ҵ�
		System.out.println(s1);
		
		//1.Sting class ��ü����
		//2. ���ڿ� ��ȯ�� ���� �ӽ÷� StringBuffer class ��ü ����
		//3. StringBuffer class�� append()�� ����
		//4. ��ȯ�� ����� StringBuffer�� ����, String���� ��ȯ
		//5. �ӽ÷� ������ StringBuffer class ��ü�� �Ҹ�
		
	}
	
	public void convert2(){ //�������ڿ��� �̿��� ���ڿ� �ռ��� �������ڿ��� �̿��� ���ڿ� �ռ����� �ξ� ȿ����
		StringBuffer buffer = new StringBuffer("�츮����");
		buffer.append("���ѹα�����!!");
		System.out.println(buffer);
		
		//1. StringBufferŬ���� ��ü����
		//2. append()�޼ҵ� ����. 
		
	}
	
	public static void main(String[] args) {
		
		StringConvertTest convertTest = new StringConvertTest();
		
		System.out.println("�ΰ��� String ���ڿ��� + �����ڸ� �̿��� ���ڿ� �ռ�");
		convertTest.convert1();
		
		System.out.println("=========================");
		
		System.out.println("StringBuffer class�� append()�޼ҵ带 �̿��� ���ڿ� �ռ� ");
		convertTest.convert2();
	}

}
