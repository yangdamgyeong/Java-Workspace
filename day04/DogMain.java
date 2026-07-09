package kr.ac.kopo.day04;

public class DogMain {
	
	public static void main(String[] args) {
		
		Dog d = new Dog("야옹이", 2);
		Dog d2 = new Dog("옹이", 3);
		
		d.show();
		d2.show();
		
		d2.setAge(7);
		d2.show();
	}

}
