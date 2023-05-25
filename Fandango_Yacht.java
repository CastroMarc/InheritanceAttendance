//We used inheritance in order to use the method STOP() from the superclass
public class Fandango_Yacht extends Vehicle{
	
	String MainSailColor = "Blue";
	
	void Float() {
		System.out.println("The boat is sinking group yourselves into 5");
		
	}
	//We used overriding to provide a specific method from the superclass which is the method STOP()
	@Override
	void STOP() {
		//System.out.println("Override Method");
		super.STOP();

	}
	
}
