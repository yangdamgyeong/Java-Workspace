package kr.ac.kopo.day06;

public class StringMain02 {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		//str3 = new String("abc");
		//str3 = new String("Hello");
		//str = null;
		//str2 = null;
		
		//str3 = "Hello";
		
		// 문자열 비교
		if(str.equals(str3)) {
			System.out.println("문자열 같다");
		}else {
			System.out.println("문자열 같지 않다");
		}
		// 주소 비교
		if(str == str3) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		System.out.printf("[%s] == [%s] : %b\n", str, str3, str.equals(str3));
		System.out.printf("[%s] == [%s] : %b\n", str, str3, str.equalsIgnoreCase(str3));
		
		//---------------------------------
		String[] names = {"홍길동", "강길동", "홍길순", "윤길동", "김홍수", "홍길동" ,"한길동", "윤길홍"};
		
		// 전체 이름이 "홍길동" 조회
		
		System.out.println(">> 홍길동만 출력");
		
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		/*
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("홍길동")){
				System.out.println(names[i]);
			}
		}*/
		
		System.out.println(">> 홍씨 성을 가진 목록 조회");
		for(String name : names) {
			 if(name.startsWith("홍")) {
				 System.out.println(name);
			 }
		}
		
		System.out.println(">> 이름이 길동인 목록 조회");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println(">> 이름에 홍이 포함된 목록 조회");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
	}

}
