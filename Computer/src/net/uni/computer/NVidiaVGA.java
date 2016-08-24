package net.uni.computer;

import net.uni.VGA;

public class NVidiaVGA implements VGA {

	private String name;
	private String manufactor;
	
	public NVidiaVGA(String name, String manufactor) {
		this.name = name;
		this.manufactor = manufactor;
	}

	@Override
	public void printVGAInfo() {
		System.out.println("제조사 : " + manufactor);
		System.out.println("그래픽 칩셋 명 : " + name);
	}
	
}
