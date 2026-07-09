package kr.ac.kopo.day04;

import java.util.Scanner;

public class GugudanMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Gugudan gu = new Gugudan();
		
		gu.print();
		
		int dan = gu.inputDan();
		
		gu.print(dan);
		
		int startDan = gu.inputDan();
		int endDan = gu.inputDan();
		gu.print(startDan, endDan);
	}

}
