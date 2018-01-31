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
		//JTable�� ���õ� vector�� ����� PersonDTO�� no������ ����� Ű������ ����
		vector.remove(Pno);
	}
	
	public PersonDTO select(int Pno) {
		//JTable�� ���õ� vector�� ����� PersonDTO�� no������ ����� Ű������ ��ȸ
		return vector.get(Pno);
	}
	
	public Vector<PersonDTO> selectAll() {
		return vector;
	}

}
