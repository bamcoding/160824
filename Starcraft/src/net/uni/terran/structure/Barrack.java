package net.uni.terran.structure;

import net.uni.terran.bionic.Firebat;
import net.uni.terran.bionic.Ghost;
import net.uni.terran.bionic.Marine;
import net.uni.terran.bionic.Medic;
import net.uni.unit.Bionic;

public class Barrack {

	public Bionic makeUnit(int type) {
		
		Bionic unit = null;
		
		if ( type == 1 ) {
			System.out.println("마린을 만들었습니다.");
			unit = new Marine();
		}
		else if ( type == 2 ) {
			System.out.println("파이어벳을 만들었습니다.");
			unit = new Firebat();
		}
		else if ( type == 3 ) {
			System.out.println("메딕을 만들었습니다.");
			unit = new Medic();
		}
		else if ( type == 4 ) {
			System.out.println("고스트를 만들었습니다.");
			unit = new Ghost();
		}
		
		return unit;
	}
	
}
