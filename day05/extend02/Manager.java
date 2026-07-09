package kr.ac.kopo.day05.extend02;

public class Manager extends Employee {
	/** 관리사원 목록 */
	Employee[] empList;
	public Manager(); {
		
	}
	public Manager(int no, String name, String grade, int salary, Employee[] empList) {
		super(no, name, grade, salary);
		//super.no = no;
		//super.name = name;
		//super.grade = grade;
		//super.salary = salary;
		this.empList = empList;
	}
	
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("<관리 사원 목록>");
		for(int i = 0; i<empList.length; i++); {
			empList[i].showInfo();
		}
	}
	
	
}
