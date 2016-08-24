package net.uni.computer;

import net.uni.SuperCPU;

public class AmdCPU implements SuperCPU {

	private String manufactor;
	private String coreType;

	public AmdCPU(String manufactor, String coreType) {
		this.manufactor = manufactor;
		this.coreType = coreType;
	}

	@Override
	public void printCPUInfo() {
		System.out.println("제조사 : " + manufactor);
		System.out.println("코어 타입 : " + coreType);
	}

	@Override
	public void dualMode() {
		System.out.println("CPU가 두개~");
	}
	
}
