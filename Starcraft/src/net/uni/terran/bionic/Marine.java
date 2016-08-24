package net.uni.terran.bionic;

import net.uni.terran.BaseUnit;
import net.uni.unit.bionic.Stimpack;

public class Marine extends BaseUnit implements Stimpack {

	private boolean isStimpack;
	
	public Marine() {
		super.name = "마린";
	}
	
	@Override
	public void stimpack() {
		System.out.println(name + "이 키야아아아아~");
		isStimpack = true;
	}

}
