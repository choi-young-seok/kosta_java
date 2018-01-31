package com.kosta.java0808.io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) throws Exception {
//		File f = new File(String ���);
		
//		�� �ϱ� !!
//		�ڹ��� ��� ǥ�����
//		 - > �� ������ �������̸� \\Ȥ�� /�� ǥ��
//		File f = new File("E:\\Kosta Project_neon\\JavaApp\\0808");
//		File f = new File("E:/Kosta Project_neon/JavaApp/0808/a.txt");
		File f = new File("junghoon/jeong/a.txt");
		System.out.println("���� ���� ���� : " + f.exists());	
	
//		�� ��Ŭ������ JavaProject�� ������ ������Ʈ ���� ��δ� 
//		   ������Ʈ ������� ������ ���·� ��� �ϴ� ���� ����
//		ex)"E:/Kosta Project_neon/JavaApp/0808"  =>��Ŭ���� ǥ�� : "0808/a.txt"
		
		System.out.println("���� ���� ���� : " + f.isFile());
		System.out.println("���� ���� ���� : " + f.isDirectory());

		System.out.println("�����̸�: "+ f.getName());
	   
		System.out.println("===========���ϰ��===========");
		System.out.println("f.getPath(): "+f.getPath());
		System.out.println("f.getAbsolutePath(): "+f.getAbsolutePath());
		//throws IOExceptionó��
		System.out.println("f.getCanonicalPath(): "+f.getCanonicalPath());
		   
		System.out.println("f.getParent(): "+ f.getParent());//f: a.txt
		System.out.println("f.length(): "+ f.length());//����,����:1  �ѱ�:2
		 
		System.out.println("===========���������===========");
//		//���������(JVM�󿡼� ����)
//		boolean flag = f.delete();
//		if(flag){
//			System.out.println("���ϻ�������!!");
//		}else{
//			System.out.println("���ϻ�������!!");
//		} 
//		
//		
//		System.out.println("===========��������===========");
//		File f3 = new File("junghoon/jeong");
//		System.out.println("���������� ����? "+ f3.exists());
		
//		boolean flag2 = f3.mkdirs();//mkdirs: make directory
//		
//		if(flag2){
//			System.out.println("�������� ����!!");
//		}else{
//			System.out.println("�������� ����!!");   
//		}
//		   
//	 	 System.out.println("===========���������===========");
	 	 
	   
	}
}
