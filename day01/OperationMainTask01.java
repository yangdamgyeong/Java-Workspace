/*
 * 키보드로 반지름을 입력받아 원넓이와 원둘레를 출력하는 코드를 작성 (출력은 소수점 3째자리까지 출력)
 * 반지름을 입력 : 10
 * 반지름 : 10 ==> 원넓이 : 314.159 원둘레 : 62.832
 */

package kr.ac.kopo.day01;

import java.util.Scanner;

public class OperationMainTask01 {
	
	public static void main(String[] args) {
		double pi = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력 : ");
		int r = sc.nextInt();
		
		System.out.printf("반지름 : %d ==> 원넓이 : %.3f", r, (double)r * r * pi);
		
		System.out.printf("원둘레 : %.3f\n",(double)2 * r * pi);
	}
	

}
