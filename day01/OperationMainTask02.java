/*
 * 물건값과 지불한 돈의 액수를 입력하면 거스름돈을 출력하고, 거스름돈에서 1000원, 500원, 100원, 50원, 10원의 개수 출력
 * 
 * 물건값을 입력하세요 : 3480
 * 지불한 돈의 액수를 입력하세요 : 10000
 * 
 * 거스름돈 : 6520원
 * 1000원 : 6개
 *  500원 : 1개
 *  100원 : 0개
 *   50원 : 0개
 *   10원 : 2개
 */
package kr.ac.kopo.day01;

import java.util.Scanner;

public class OperationMainTask02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("지불한 돈의 액수를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.printf("거스름돈 : %d 원\n", b - a);
		System.out.printf("1000원 : %d 개\n", (b - a) / 1000);
		System.out.printf(" 500원 : %d 개\n", (b - a) / 500);
		System.out.printf(" 100원 : %d 개\n", (b - a) / 100);
		System.out.printf("  50원 : %d 개\n", (b - a) / 50);
		System.out.printf("  10원 : %d 개\n", (b - a) / 10);
		
	}

}
