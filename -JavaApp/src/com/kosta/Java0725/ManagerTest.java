package com.kosta.Java0725;

class Manager{
	private String name;
	private int salary;
	private String jobTitle;
	
	public Manager(String name, int salary, String jobTitle) {
		super();
		this.name = name;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	public String getDetails(){
		
		return "������� "+name+"�̰� ������ "+salary+", ������ "+jobTitle;
	}
}

class EmployeeManager extends Manager{
	private String department;

	public EmployeeManager(String name, int salary, String jobTitle, String department) {
		super(name, salary, jobTitle); //�θ�Ŭ������ ������ ȣ��
		//������ �ȿ��� this() �Ǵ� super()�� ȣ��ÿ��� �ݵ�� ù�ٿ� ��ġ.
		this.department = department;
	}
	
	@Override
	public String getDetails() {
		
		return super.getDetails() + " �μ����� " + department;
	}
	
	
}
public class ManagerTest {
	public static void main(String[] args) {
		EmployeeManager employeeManager = new EmployeeManager("ȫ�浿", 3000, "���α׷��� ������", "��ǰ���ߺ�");
		
		System.out.println(employeeManager.getDetails()); 
	
	}

}
