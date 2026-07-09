package kr.ac.kopo.day06;
import java.util.Arrays;
public class StringMain03 {
	
	public static void main(String[] args) {
		
		String str = "Hello World!!!";
		
		System.out.println(str + " 'l' 시작 위치 :" + str.indexOf("l"));
		System.out.println(str + " 'l' 위치 :" + str.indexOf("p"));
		System.out.println(str + " 'l' 마지막 위치 :" + str.lastIndexOf("l"));
		
		System.out.println(">> 'l'의 위치 출력");
		int index = str.indexOf('l');
		while(index != -1) {
			System.out.println(str + " 'l'의 위치 : "+ index );
			index = str.indexOf('l', index+1);
			if(index == -1) break;
		}
		
		str = "Hello World!!!";
		System.out.println("str : " + str);
		
		String str2 = str.substring(3, 9); //[3] ~ [9 - 1]
		System.out.println("substring(3,9) : " + str2);	
		
		String str3 = str.replace("l", "rr");
		System.out.println("replace(l, rr) : " + str3);
		
		str = "       Hello      World!          ";
		System.out.printf("str : [%s], length : %d\n", str, str.length());
		
		str = str.trim();
		System.out.printf("str : [%s], length : %d\n", str, str.length());
		
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());
		
		str = "hello World!!!";
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		str = "2027-07-08";
		arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		str = "2027.07.08";
		arr = str.split("\\.");
		System.out.println(Arrays.toString(arr));
		
		str = "2027/07/08 11:53:28";
		String[] dateArr = str.split(" ");
		System.out.println(Arrays.toString(dateArr));
		
		String [] dArr = dateArr[0].split("/");
		String [] timeArr = dateArr[1].split(":"); 
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(timeArr));
		
		String year = dArr[0];
		String month = dArr[1];
		String date = dArr[2];
		String hour = timeArr[0];
		String min = timeArr[1];
		String sec = timeArr[2];
	}
}
