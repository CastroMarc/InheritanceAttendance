//We used inheritance in order to use the method STOP() from the superclass
public class U_2SpyPlane extends Vehicle {
	
	int WingSpan = 52;
	
	void Fly() {
		System.out.println("Flying to the moon");

		
	}
	//We used overriding to provide a specific method from the superclass which is the method STOP()
	@Override
	void STOP() {
		//System.out.println("Override Method");
		super.STOP();
		
	}
	
}
