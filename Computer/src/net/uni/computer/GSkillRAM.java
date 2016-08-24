package net.uni.computer;

import net.uni.CPU;
import net.uni.RAM;

public class GSkillRAM implements RAM, CPU {

	private String capacity;
	private String manufactor;
	
	public GSkillRAM(String capacity, String manufactor) {
		this.capacity = capacity;
		this.manufactor = manufactor;
	}
	
	@Override
	public void printRAMInfo() {
		System.out.println("제조사 : " + manufactor);
		System.out.println("용량 : " + capacity);
	}

	@Override
	public void printCPUInfo() {
		System.out.println("슬롯이 안맞아요");
	}
	
}
