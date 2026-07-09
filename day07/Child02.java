package kr.ac.kopo.day07;

public class Child02 extends Parent{
	
	private String name;
	private int age;
	
	public Child02() {
		name = "자식02";
		age = 17;
	}
	
	@Override
	public void info() {
		System.out.println("내이름은" + name + ", 나이는 : " + age + "살입니다.");
	}
	
	public void sing() {
		System.out.println("나는 노래를 부릅니다.");
	}
	
	public void dance() {
		System.out.println("나는 춤을 춥니다.");
	}

}
