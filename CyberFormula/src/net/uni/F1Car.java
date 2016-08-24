package net.uni;

public class F1Car extends Car {

	public F1Car() {
		super.goSound = "부르르르릉~";
		super.stopSound = "끼이이이이이익~";
	}
	
	@Override
	public void turbo() {
		super.goSound = "부와아아아아앙!!";
		super.stopSound = "끼이이이이이이이이이이이이이이이이이이이이이이익~~";
		super.go();
	}
	
}
