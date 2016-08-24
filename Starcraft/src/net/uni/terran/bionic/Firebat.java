package net.uni.terran.bionic;

import net.uni.terran.BaseUnit;
import net.uni.unit.bionic.Stimpack;

public class Firebat extends BaseUnit implements Stimpack {

	private boolean isStimpack;
	
	public Firebat() {
		super.name = "파이어벳";
	}

	@Override
	public void stimpack() {
		System.out.println(name + "이 키야아아아아~");
		isStimpack = true;
	}

}
