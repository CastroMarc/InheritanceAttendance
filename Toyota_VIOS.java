//We used inheritance in order to use the method STOP() from the superclass
public class Toyota_VIOS extends Vehicle {
	
	String TireType = "Road Tire";
	
	void Drive() {
		System.out.println("Vroom Vroom Skkkrt Skkrt");
		
	}
	//We used overriding to provide a specific method from the superclass which is the method STOP()
	@Override
	void STOP() {
		//System.out.println("Override Method");
		super.STOP();
	}
	
}
