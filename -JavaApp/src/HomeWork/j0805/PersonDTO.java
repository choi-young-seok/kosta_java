package HomeWork.j0805;

public class PersonDTO {
	
	private String name;
	private String job;
	private int age;
	private int no;
	
	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(String name, String job, int age, int no) {
		super();
		this.name = name;
		this.job = job;
		this.age = age;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", job=" + job + ", age=" + age + ", no=" + no + "]";
	}
	

}
