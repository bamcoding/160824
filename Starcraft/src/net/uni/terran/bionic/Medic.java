package net.uni.terran.bionic;

import net.uni.unit.bionic.Medical;

public class Medic implements Medical {

	@Override
	public void move() {
		System.out.println("메딕이 이동합니다.");
	}

	@Override
	public void patrol() {
		System.out.println("메딕이 정찰합니다.");
	}

	@Override
	public void stop() {
		System.out.println("메딕이 멈춥니다.");
	}

	@Override
	public void hold() {
		System.out.println("메딕이 기다립니다.");
	}

	@Override
	public void attack() {
		System.out.println("메딕이 치료합니다.");
	}

	@Override
	public void blind() {
		System.out.println("메딕이 상대방의 시야를 가립니다.");
	}

	@Override
	public void restoration() {
		System.out.println("메딕이 아군의 상태이상을 치료합니다.");
	}

}
