package HomeWork.j0728;

import java.util.Vector;

public class PersonMenu {
	
	public Vector<Person> persons;
	Person p = new Person();
	int i = 0;
	
	public PersonMenu() {
		persons = new Vector<>();
	}
	
	public void insert(Person p){//(String name, String job, int age){
		persons.add(p);
	}
	
	public void delete(int idx){
		persons.remove(idx-1);
	}
	
	public void update(Person p, int updateNum){

		Person op = persons.get(updateNum-1);
		
		op.setAge(p.getAge());
		op.setJob(p.getJob());
		
	}
	
	public void select(){
		for (int i = 0; i < persons.size(); i++) {
			Person p = persons.get(i);	
				System.out.println((i+1)+p.toString());
		}
	}
	

}
