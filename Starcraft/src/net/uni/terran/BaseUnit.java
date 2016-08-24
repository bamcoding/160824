package net.uni.terran;

import net.uni.unit.Unit;

public class BaseUnit implements Unit {

	protected String name = "";
	
	@Override
	public void move() {
		System.out.println(name + "이(가) 이동합니다.");
	}

	@Override
	public void patrol() {
		System.out.println(name + "이(가) 정찰합니다.");
	}

	@Override
	public void stop() {
		System.out.println(name + "이(가) 멈춥니다.");
	}

	@Override
	public void hold() {
		System.out.println(name + "이(가) 기다립니다.");
	}

	@Override
	public void attack() {
		System.out.println(name + "이(가) 공격합니다.");
	}

}
