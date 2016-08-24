package net.uni.terran.mechanic;

import net.uni.unit.mechanic.SiegeMode;

public class SiegeTank implements SiegeMode {

	@Override
	public void move() {
		System.out.println("시즈탱크가 이동합니다. 시즈모드 일 때는 움직이 못합니다.");
	}

	@Override
	public void patrol() {
		System.out.println("시즈탱크가 정찰합니다.");
	}

	@Override
	public void stop() {
		System.out.println("시즈탱크가 멈춥니다.");
	}

	@Override
	public void hold() {
		System.out.println("시즈탱크가 기다립니다.");
	}

	@Override
	public void attack() {
		System.out.println("시즈탱크가 공격합니다. 시즈모드 일 때는 대포를 쏩니다.");
	}

	@Override
	public void siegeMode() {
		System.out.println("시즈모드로 변신합니다.");
	}

	@Override
	public void tankMode() {
		System.out.println("탱크모드로 변신합니다.");
	}

}
