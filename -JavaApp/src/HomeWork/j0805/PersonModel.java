package HomeWork.j0805;

import java.util.Vector;

public class PersonModel {
	Vector<PersonDTO> vector;
	
	public PersonModel() {
		vector = new Vector<>();
	}
	
	public void insert(PersonDTO p) {
		vector.add(p);
	}
	
	public void update(PersonDTO p) {
		
		PersonDTO newP = vector.get(p.getNo());
		newP.setName(p.getName());
		newP.setAge(p.getAge());
		newP.setJob(p.getJob());
	}
	
	public void delete(int Pno) {
		//JTable에 선택된 vector에 저장된 PersonDTO의 no변수에 저장된 키값으로 삭제
		vector.remove(Pno);
	}
	
	public PersonDTO select(int Pno) {
		//JTable에 선택된 vector에 저장된 PersonDTO의 no변수에 저장된 키값으로 조회
		return vector.get(Pno);
	}
	
	public Vector<PersonDTO> selectAll() {
		return vector;
	}

}
