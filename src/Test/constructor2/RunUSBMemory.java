package Test.constructor2;

public class RunUSBMemory {

	public static void main(String[] args) {
		USBMemory u1 = new USBMemory(64, "Black");
		USBMemory u2 = new USBMemory(128, "Red");
		
		u1.readMemory();
		
		u2.writMemory();
		u2.readMemory();
	}

}
