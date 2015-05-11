/**
 * 
 */

/**
 * @author kaushlendra
 *
 */
public class Bus extends Vehicle {

	@Override
	public void vehicleType() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Type BUS");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Color Red");
	}

	@Override
	public String getNumberOfWheels() {
		// TODO Auto-generated method stub
		return "10";
	}
	@Override
	public String getNumberOfGears(){
		return "5";
	}
}
