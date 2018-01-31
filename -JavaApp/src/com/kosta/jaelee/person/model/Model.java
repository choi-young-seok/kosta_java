package com.kosta.jaelee.person.model;

import java.util.Vector;

public class Model {
	Vector<Person> persons;// ������ �����

	public Model() {
		persons = new Vector<>();
	}

	public void insert(Person p) {// ���Ϳ� �������Է�
		persons.add(p);
	}

	public void update(Person p) {// �����ͼ���
		for (int i = 0; i < persons.size(); i++) {
			// ��ġ�ϴ� ��ȣ�� ã��
			Person pp = persons.get(i); // pp:����������, p:�����ҵ�����
			if (pp.getNo() == p.getNo()) {// ��ġ�ϴ� ��ȣ�� ���� ���̿� ���� ����!!
				pp.setAge(p.getAge());
				pp.setJob(p.getJob());
			}
		}
	}// update

	public boolean delete(int delNo) {// �����ͻ���, ������ �ߵǾ��ٸ� true����
		for (int i = 0; i < persons.size(); i++) {// ��ü���� �˻�
			Person pp = persons.get(i); // pp:���� ������
			if (pp.getNo() == delNo) { // ��ġ�ϴ� ��ȣ�� ã��
				persons.remove(i);
				return true;
			}
		}
		return false;
	}// delete

	public Person select(int no) {// �����Ͱ˻�(�Ѱ��� Person), ���������� ���
		// ������ ��ȣno�� ���� Vector���� �������� ��ġ�ϴ� ���� ã�� ������ ����

		for (int i = 0; i < persons.size(); i++) {
			// �Ķ���͸� ���� ���޵� no�� ���� ����� ?
			Person pp = persons.get(i);
			if (pp.getNo() == no) {
				return pp;
			}
			// if(persons.get(i).getNo() == no){//��ġ�ϴ� ��ȣ�� ã�Ҵٸ�
			// return persons.get(i); }
		}
		return null;// ��ġ�ϴ� ��ȣ�� ã�� ������!!
	}// select

	public Vector<Person> selectAll() {// �����Ͱ˻�(��ü Person)
		return persons;
	}// selectAll

}
