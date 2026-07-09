package kr.ac.kopo.day06.stat;

public class Employee {
	
	int no;
	String name;
	String grade;
	static int EmployeeTotal; // 입사한 총 사원수
	
	public Employee(int no, String name, String grade) {
		super();
		this.no = no;
		this.name = name;
		this.grade = grade;
		
		Employee.EmployeeTotal++;
	}
	
	void info() {
		System.out.println("no : " + no + ", name : " + name + ", grade : " + grade );
	}
	
	static void printEmployeeTotal() {
		System.out.println("지금까지 입사한 총 사원수 : " + EmployeeTotal + "명");
	}

}
