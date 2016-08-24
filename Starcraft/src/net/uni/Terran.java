package net.uni;

import net.uni.terran.structure.Barrack;
import net.uni.terran.structure.Factory;
import net.uni.unit.Mechanic;
import net.uni.unit.bionic.Medical;
import net.uni.unit.bionic.Special;
import net.uni.unit.bionic.Stimpack;
import net.uni.unit.mechanic.Mine;
import net.uni.unit.mechanic.SiegeMode;

public class Terran {

	public void gameStart() {
		
		Barrack barrack = new Barrack();
		
		Stimpack marine = (Stimpack) barrack.makeUnit(1);
		marine.stimpack();
		marine.attack();
		
		Stimpack firebat = (Stimpack) barrack.makeUnit(2);
		firebat.stimpack();
		firebat.attack();
		
		Medical medic = (Medical) barrack.makeUnit(3);
		medic.attack();
		medic.blind();
		medic.restoration();
		
		Special ghost = (Special) barrack.makeUnit(4);
		ghost.attack();
		ghost.clocking();
		ghost.move();
		ghost.stop();
		ghost.lockDown();
		ghost.nuclear();
		
		Factory factory = new Factory();
		SiegeMode tank = (SiegeMode) factory.makeUnit(1);
		tank.attack();
		tank.siegeMode();
		tank.attack();
		tank.tankMode();
		
		Mechanic goliath = factory.makeUnit(2);
		goliath.move();
		goliath.attack();
		
		Mine vulture = (Mine) factory.makeUnit(3);
		vulture.attack();
		vulture.layUnderTheGroundMine();
		vulture.move();
	}

	public static void main(String[] args) {
		new Terran().gameStart();
	}
	
}
