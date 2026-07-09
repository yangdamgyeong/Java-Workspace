package kr.ac.kopo.day07.abs;

import java.util.Scanner;

public class Menu {

	@SuppressWarnings("resource")
	public int choice() {
		System.out.println(">> MENU <<");
		System.out.println("1. 삼성프린터 2. LG프린터");
		System.out.println("출력할 프린터를 선택하세요 : ");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		return type;
	}
	
	public void start() {
		int type = choice();
		Printer p = null;
		switch(type) {
		case 1 :
			p = new amsungPrinter();
			break;
		case 2 :
			p = new LGPrinter();
			break;
		}
		if( p!=null) {
			p.print();
		}else {
			System.out.println("잘못입력하였습니다.");
		}
	}
}

