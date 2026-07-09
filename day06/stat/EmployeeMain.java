package kr.ac.kopo.day06.stat;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee.printEmployeeTotal();
		
		//int EmployeeTotal = 0; // 입사한 총 사원수
		//System.out.println("입사한 총 사원수 : " + EmployeeTotal + "명");
		
		Employee e = new Employee(1, "홍길동", "사원");
		
		//EmployeeTotal++;
		Employee e2 = new Employee(2, "고길동", "사원");
		//EmployeeTotal++;
		
		e.info();
		e2.info();
		
		Employee.printEmployeeTotal();

	}

}
