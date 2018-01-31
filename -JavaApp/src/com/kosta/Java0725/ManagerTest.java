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
		
		return "사원명은 "+name+"이고 연봉은 "+salary+", 직업은 "+jobTitle;
	}
}

class EmployeeManager extends Manager{
	private String department;

	public EmployeeManager(String name, int salary, String jobTitle, String department) {
		super(name, salary, jobTitle); //부모클래스의 생성자 호출
		//생성자 안에서 this() 또는 super()를 호출시에는 반드시 첫줄에 위치.
		this.department = department;
	}
	
	@Override
	public String getDetails() {
		
		return super.getDetails() + " 부서명은 " + department;
	}
	
	
}
public class ManagerTest {
	public static void main(String[] args) {
		EmployeeManager employeeManager = new EmployeeManager("홍길동", 3000, "프로그래머 개발자", "제품개발부");
		
		System.out.println(employeeManager.getDetails()); 
	
	}

}
