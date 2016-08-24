package net.uni.terran.mechanic;

import net.uni.unit.mechanic.Mine;

public class Vulture implements Mine {

	@Override
	public void move() {
		System.out.println("벌쳐가 매우 빠르게 움직입니다.");
	}

	@Override
	public void patrol() {
		System.out.println("벌쳐가 매우 빠르게 정찰합니다.");
	}

	@Override
	public void stop() {
		System.out.println("벌쳐가 멈춥니다.");
	}

	@Override
	public void hold() {
		System.out.println("벌쳐가 기다립니다.");
	}

	@Override
	public void attack() {
		System.out.println("벌쳐가 유탄을 쏩니다.");
	}

	@Override
	public void layUnderTheGroundMine() {
		System.out.println("벌쳐가 지뢰를 매설합니다.");
	}

}
