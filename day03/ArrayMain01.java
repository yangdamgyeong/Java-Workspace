package kr.ac.kopo.day03;
import java.util.Arrays;
public class ArrayMain01 {
	
	public static void main(String[] args) {
		
		int[] ar = {10, 20, 30, 40, 50};
		
		System.out.println("ar : " + ar);
		System.out.println("첫번째 정수 : " + ar[0]);
		System.out.println("두번째 정수 : " + ar[1]);
		System.out.println("세번째 정수 : " + ar[2]);
		System.out.println("네번째 정수 : " + ar[3]);
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(i + 1 + "번째 정수 :" + ar[i]);
			
		}
		for(int num : ar) {
			System.out.println(num);
		}
		
		System.out.println(Arrays.toString(ar));
	}

}
