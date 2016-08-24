package net.uni;

public class Track {

	public static void main(String[] args) {
		
		Car normalCar = new Car();
		normalCar.go();
		normalCar.stop();
		normalCar.turbo();
		
		System.out.println();
		
		Car f1 = new F1Car();
		f1.go();
		f1.turbo();
		f1.stop();
		
	}
	
}
