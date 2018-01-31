package com.kosta.jaelee.person.model;

import java.util.Vector;

public class Model {
	Vector<Person> persons;// 데이터 저장소

	public Model() {
		persons = new Vector<>();
	}

	public void insert(Person p) {// 벡터에 데이터입력
		persons.add(p);
	}

	public void update(Person p) {// 데이터수정
		for (int i = 0; i < persons.size(); i++) {
			// 일치하는 번호를 찾기
			Person pp = persons.get(i); // pp:기존데이터, p:변경할데이터
			if (pp.getNo() == p.getNo()) {// 일치하는 번호에 대한 나이와 직업 변경!!
				pp.setAge(p.getAge());
				pp.setJob(p.getJob());
			}
		}
	}// update

	public boolean delete(int delNo) {// 데이터삭제, 삭제가 잘되었다면 true리턴
		for (int i = 0; i < persons.size(); i++) {// 전체벡터 검색
			Person pp = persons.get(i); // pp:기존 데이터
			if (pp.getNo() == delNo) { // 일치하는 번호를 찾기
				persons.remove(i);
				return true;
			}
		}
		return false;
	}// delete

	public Person select(int no) {// 데이터검색(한개의 Person), 수정폼에서 사용
		// 유일한 번호no를 통해 Vector안의 데이터중 일치하는 값을 찾아 정보를 리턴

		for (int i = 0; i < persons.size(); i++) {
			// 파라미터를 통해 전달된 no와 비교할 대상은 ?
			Person pp = persons.get(i);
			if (pp.getNo() == no) {
				return pp;
			}
			// if(persons.get(i).getNo() == no){//일치하는 번호를 찾았다면
			// return persons.get(i); }
		}
		return null;// 일치하는 번호를 찾지 못했음!!
	}// select

	public Vector<Person> selectAll() {// 데이터검색(전체 Person)
		return persons;
	}// selectAll

}
