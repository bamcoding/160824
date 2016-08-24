package net.uni.terran.mechanic;

import net.uni.unit.Mechanic;

public class Goliath implements Mechanic {

	@Override
	public void move() {
		System.out.println("골리앗이 이동합니다.");
	}

	@Override
	public void patrol() {
		System.out.println("골리앗이 정찰합니다.");
	}

	@Override
	public void stop() {
		System.out.println("골리앗이 멈춥니다.");
	}

	@Override
	public void hold() {
		System.out.println("골리앗이 기다립니다.");
	}

	@Override
	public void attack() {
		System.out.println("골리앗이 지상과 지공 공격합니다.");
	}

}
