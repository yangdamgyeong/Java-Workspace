package kr.ac.kopo.day07;

public class CastMain {
	
	/*
	public static void print(Child01 c01) {
		c01.info();
	}
	
	public static void print(Child02 c02) {
		c02.info();
	}*/
	
	public static void print(Parent p) {
		p.info();
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		}else if (p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.dance();
		}
		/*
		System.out.println("instanceof Child01 : " + (p instanceof Child01));
		System.out.println("instanceof Child02 : " + (p instanceof Child02));
		System.out.println("instanceof Parent : " + (p instanceof Parent));
		*/
	}
	
	public static void main(String[] args) {
		
		print(new Child01());
		print(new Child02());
		print(new Parent());
		
		/*묵시적 형변환
		Parent p = new Child01();
		p.info();
		
		
		Child01 c01 = new Child01();
		c01.info();
		c01.study();
		c01.sleep();
		
		Child02 c02 = new Child02();
		c02.info();
		c02.sing();
		c02.dance();
		
		Parent p = new Parent();
		p.info();
		*/
	}

}
