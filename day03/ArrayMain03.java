package kr.ac.kopo.day03;

import java.util.Scanner;
/*
 * 키보드로 5개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오
 *  
   num1 : 12
   num2 : 9
   num3 : 6
   num4 : 20
   num5 : 30
   
   <print>
   30 20 6 8 12

 */  
public class ArrayMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] nums = new int[5];
		
		for(int i=0; i < nums.length; i++) {
			System.out.print("num" + (i+1) + ":");
			nums[i] = sc.nextInt();
		
	    }
		System.out.println("< print >");
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[4-i] + "\t");
		}
		/*
		for(int i = nums.length-1; ; i--) {
			System.out.print(nums[i] + "\t");
		}*/
		System.out.println();
	
	}
	
	

}
