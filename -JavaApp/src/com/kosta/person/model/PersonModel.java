package com.kosta.person.model;

import java.util.Vector;

import com.kosta.person.dto.Person;

public class PersonModel {
	Vector<Person> vector;
	Person person;
	
	public PersonModel() {
		vector = new Vector<>();
		person = new Person();
	}//생성자
	
	//추가
	public void insert(Person person){
		vector.add(person);
	}
	//삭제
	public void delete(int no){
		vector.remove(no);
		//삭제한 라인부터 라인 떙기기
		for (int i = no; i < vector.size(); i++) {
			person = vector.get(i);
			person.setNo(i+1);
//			System.out.println(i+1);
		}
	}
	
	//수정
//	public void update(int no){
//		Person p = vector.get(no-1);
//		person.setName(p.getName());
//		person.setAge(p.getAge());
//		person.setJob(p.getJob());
//	}
//	
	public void update(int idx, Person p){
		//for문으로 일치하는 로직 찾기
		//for문을 돌리는 이유? vector.get하면 값을 못얻어오나?

		Person person = vector.get(idx-1);
		person.setName(p.getName());
		person.setAge(p.getAge());
		person.setJob(p.getJob());
//		System.out.println(p.getJob());
	}
	//조회
	public Person select(int no){
		return vector.get(no-1);
	}
	
	public Vector<Person> selectAll(){
		return vector;
	}
	
}
