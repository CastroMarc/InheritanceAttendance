//In here we are testing the output of each vehicle class if the inheritace is working as well as the override method
public class VehicleTest {

	public static void main(String[] args) {
		
		//TOYOTA VIOS
		Toyota_VIOS car = new Toyota_VIOS();
		
		System.out.println("TOYOTA VIOS");
		System.out.println("Car Speed: " + car.CarSpeed);
		System.out.println("Car Color: " + car.CarColor);
		System.out.println("Car Price: " + car.CarPrice);
		System.out.println("Car Tire type: " + car.TireType);
		
		car.Drive();
		car.STOP();
		
		
		//U-2 Spy Plane
		U_2SpyPlane plane = new U_2SpyPlane();
		
		System.out.println("\n" + "U-2 SPY PLANE");
		System.out.println("Plane Speed: " + plane.PlaneSpeed);
		System.out.println("Plane Color: " + plane.PlaneColor);
		System.out.println("Plane Price: " + plane.PlanePrice);
		System.out.println("Plane Wing Span: " + plane.WingSpan + "ft");
		
		plane.Fly();
		plane.STOP();
		
		
		//Fandango Yacht
		Fandango_Yacht boat = new Fandango_Yacht();
		
		System.out.println("\n" + "FANDANGO YACHT" );
		System.out.println("Boat Speed: " + boat.BoatSpeed);
		System.out.println("Boat Color: " + boat.BoatColor);
		System.out.println("Boat Price: " + boat.BoatPrice);
		System.out.println("Boat Main Sail Color: " + boat.MainSailColor);
		
		boat.Float();
		boat.STOP();
		
		
		
	}

}
