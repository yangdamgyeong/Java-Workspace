package kr.ac.kopo.day04;

import java.util.Scanner;

public class Gugudan {

// 키보드로 2-9 사이의 단을 입력받아 넘겨주는 기능의 메소드
	int inputDan() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 - 9 사이의 단을 입력 : ");
		int dan = sc.nextInt();
		
		return dan;
	}

// 2 - 9단 까지의 구구단을 출력하는 메소드
	/*void printGu() {
		for(int dan=2; dan <=9; dan++) {
			System.out.println("***" + dan + "단 ***");
			for(int i=1; i<=9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
			System.out.println();
		}
		
		for(int dan=2; dan <= 9; dan++) {
			print(dan)
		} */
	void print() {
		print(2, 9);
	}
	// 매개변수로 날라오는 단에 해당하는 구구단을 출력하는 메소드
	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i=1; i <=9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	// 시작단에서부터 종료단까지 구구단을 출력하는 메소드
	void print(int start, int end) {
		for(int dan=start; dan <= end; dan++) {
			print(dan);
		}
	}

}
