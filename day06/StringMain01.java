package kr.ac.kopo.day06;

public class StringMain01 {
	
	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("hello");
		
		char[] chars = {'h', 'e', 'l', 'l', 'o'};
		String str3 = new String(chars);
		String str4 = new String(chars, 1, 4);
		String str5 = "hello";
		
		System.out.printf("str: [%s]\n", str);
		System.out.printf("str2: [%s]\n", str2);
		System.out.printf("str3: [%s]\n", str3);
		System.out.printf("str4: [%s]\n", str4);
	}

}
