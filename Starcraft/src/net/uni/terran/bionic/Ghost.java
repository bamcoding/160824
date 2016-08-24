package net.uni.terran.bionic;

import net.uni.unit.bionic.Special;

public class Ghost implements Special {

	@Override
	public void move() {
		System.out.println("고스트가 이동합니다.");
	}

	@Override
	public void patrol() {
		System.out.println("고스트가 정찰합니다.");
	}

	@Override
	public void stop() {
		System.out.println("고스트가 멈춥니다.");
	}

	@Override
	public void hold() {
		System.out.println("고스트가 기다립니다.");
	}

	@Override
	public void attack() {
		System.out.println("고스트가 총을 쏩니다.");
	}

	@Override
	public void clocking() {
		System.out.println("고스트가 시야에서 사라집니다.");
	}

	@Override
	public void lockDown() {
		System.out.println("고스트가 상대 유닛을 무력화 시켰습니다.");
	}

	@Override
	public void nuclear() {
		System.out.println("고스트가 핵을 발사했습니다.");
	}

}
