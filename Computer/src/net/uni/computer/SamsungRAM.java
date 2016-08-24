package net.uni.computer;

import net.uni.RAM;

public class SamsungRAM implements RAM {

	private String capacity;
	private String manufactor;
	
	public SamsungRAM(String capacity, String manufactor) {
		this.capacity = capacity;
		this.manufactor = manufactor;
	}
	
	@Override
	public void printRAMInfo() {
		System.out.println("제조사 : " + manufactor);
		System.out.println("용량 : " + capacity);
	}
	
}
