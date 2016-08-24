package net.uni.computer;

import net.uni.CPU;
import net.uni.Computer;
import net.uni.RAM;
import net.uni.VGA;

public class Main {

	public static void main(String[] args) {
		
		CPU cpu = new IntelCPU("AMD", "i5");
		RAM ram = new GSkillRAM("16GB", "GSkill");
		VGA vga = new RadeonVGA("GTX-90", "MSI");
		
		Computer computer = new Computer();
		computer.setCpu(cpu);
		computer.setRam(ram);
		computer.setVga(vga);
		
		computer.introduceMyComputer();
		
	}
	
}
