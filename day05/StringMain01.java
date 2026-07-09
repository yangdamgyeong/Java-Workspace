package kr.ac.kopo.day05;

public class StringMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("----- start -----");
		
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<10; i++) {
			sb += i;
		}
		/*
		String str = "";
		
		System.out.println("----- start -----");
		for(int i=1; i<100000; i++) {
			str += i;
		}
		*/
		System.out.println("----- end -----");
	}

}
