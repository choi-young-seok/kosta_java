package com.kosta.java0727;

import java.util.Vector;

public class VectorTest2 {
  public static void main(String[] args) {
	Vector<String> v = new Vector<>();
	  
	//�������Է�(input,add,insert,plus,append)
	v.addElement("ȫ�浿");
	//v.addElement(new Integer(13));//����: String���� �ڷ����� ��õǾ������Ƿ�
	v.add("�����");
	v.add("���ֿ�");
	//���ʹ� ó�� �Էµ� �����ͺ��� �ε����� �ο�
	
	//v.add(int index,String element); //Ư���ε����� �����͸� �Է�
	  /*
	      v: ȫ�浿 ����� ���ֿ�
	           0      1      2     3      4
	      v: ������ ȫ�浿 ����� ���ֿ�     
	      v: ������ �̼��� ȫ�浿 ����� ���ֿ�     
	   */
	v.add(0, "������");
	v.insertElementAt("�̼���", 1);
	
	
	//�����ͻ���(delete, drop, clear, remove)
	//"ȫ�浿"����
	//v.remove(int index)
	v.remove(2);
	for(int i=0; i<v.size(); i++){
		if("�̼���".equals(v.get(i))){
			v.remove(i);
			break;
		}
	}	
	v.remove("�����");
	v.removeAllElements();
	
	//v.removeAllElements();//��ü�����������
	//v.clear();//��ü�����������
	
	
	//�����ͼ���(edit, update, set, modify)
	//���ֿ�---> ���ֿ�
	for(int i=0; i<v.size(); i++){
		if(v.get(i).equals("���ֿ�")){
			//v.set(int index,String element)
			//v.setElementAt(String obj,int index);
			v.set(i, "���ֿ�");
		}
	}	
	
	//�����Ͱ˻�(search, find, select, get)
	for(int i=0; i<v.size(); i++ ){//������ �ε���
		//v.get(int index)
		//v.elementAt(index);
		System.out.println( i+":"+  v.get(i)  );
		
	}
	
	System.out.println("--���α׷�����--");
	  
  }//main
}



