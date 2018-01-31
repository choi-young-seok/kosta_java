package com.kosta.person.model;

import java.util.Vector;

import com.kosta.person.dto.Person;

public class PersonModel {
	Vector<Person> vector;
	Person person;
	
	public PersonModel() {
		vector = new Vector<>();
		person = new Person();
	}//������
	
	//�߰�
	public void insert(Person person){
		vector.add(person);
	}
	//����
	public void delete(int no){
		vector.remove(no);
		//������ ���κ��� ���� �����
		for (int i = no; i < vector.size(); i++) {
			person = vector.get(i);
			person.setNo(i+1);
//			System.out.println(i+1);
		}
	}
	
	//����
//	public void update(int no){
//		Person p = vector.get(no-1);
//		person.setName(p.getName());
//		person.setAge(p.getAge());
//		person.setJob(p.getJob());
//	}
//	
	public void update(int idx, Person p){
		//for������ ��ġ�ϴ� ���� ã��
		//for���� ������ ����? vector.get�ϸ� ���� ��������?

		Person person = vector.get(idx-1);
		person.setName(p.getName());
		person.setAge(p.getAge());
		person.setJob(p.getJob());
//		System.out.println(p.getJob());
	}
	//��ȸ
	public Person select(int no){
		return vector.get(no-1);
	}
	
	public Vector<Person> selectAll(){
		return vector;
	}
	
}
