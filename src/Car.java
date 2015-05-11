/**
 * 
 */

/**
 * @author kaushlendra
 *
 */
public class Car extends Vehicle {

	@Override
	public void vehicleType() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Type Car");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Colr White");
	}

	@Override
	public String getNumberOfWheels() {
		// TODO Auto-generated method stub
		return "4";
	}

	@Override
	public String getNumberOfGears(){
		return "5";
	}
}
