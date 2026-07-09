package kr.ac.kopo.day01;

/*
  두개의 정수(12, 5)의 산술연산을 출력하시오.
  12 + 5 =
 */
public class OperationMain01 {
	
	public static void main(String[] args) {
		
		int a =12, b =5;
		
		//System.out.println(a + " + " + b + " = ");
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("[%2d] + [%-2d] = %.4f\n", a, b, (double)(a / b));
		System.out.printf("%d + %d = %f\n", a, b, (double)a / b);
	}

}
