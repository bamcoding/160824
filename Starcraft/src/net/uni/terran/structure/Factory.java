package net.uni.terran.structure;

import net.uni.terran.mechanic.Goliath;
import net.uni.terran.mechanic.SiegeTank;
import net.uni.terran.mechanic.Vulture;
import net.uni.unit.Mechanic;

public class Factory {

	public Mechanic makeUnit(int type) {
		
		Mechanic unit = null;
		
		if ( type == 1 ) {
			System.out.println("시즈탱크를 만들었습니다.");
			unit = new SiegeTank();
		}
		else if ( type == 2 ) {
			System.out.println("골리앗을 만들었습니다.");
			unit = new Goliath();
		}
		else if ( type == 3 ) {
			System.out.println("벌쳐를 만들었습니다.");
			unit = new Vulture();
		}
		
		return unit;
		
	}
	
}
