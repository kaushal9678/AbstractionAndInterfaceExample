/**
 * 
 */

/**
 * @author kaushlendra
 *
 */
public class Bike extends Vehicle {

	/* (non-Javadoc)
	 * @see Vehicle#vehicleType()
	 */
	@Override
	public void vehicleType() {
		// TODO Auto-generated method stub

		System.out.println("Vehicle Type Bike");
	}

	/* (non-Javadoc)
	 * @see Vehicle#color()
	 */
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle Color Black");
	}
	@Override
	public String getNumberOfGears(){
		return "4";
	}
	@Override
	public  String getNumberOfWheels(){
		return "4";
	}
}
