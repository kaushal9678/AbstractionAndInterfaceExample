/**
 * 
 */

/**
 * @author kaushlendra
 *
 */
public class BaseClass {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * @param args
		 *            instantiate object of Car Type and call Car class methods
		 */

		System.out.println("===============  Car Type =============");

		Vehicle car = new Car();
		car.vehicleType();
		car.color();
		System.out.println("Car Has number of Gears" + " "
				+ car.getNumberOfGears() + " " + "and" + " "
				+ car.getNumberOfWheels() + "" + " Number of wheels");

		System.out.println("===============  Bus Type =============");

		// * instantiate object of Bus Type and call Bus class methods
		Bus bus = new Bus();
		bus.vehicleType();
		bus.color();
		System.out.println("Bus Has number of Gears" + " "
				+ bus.getNumberOfGears() + " " + "and" + " "
				+ bus.getNumberOfWheels() + "" + " Number of wheels");
		System.out.println("===============  Bike Type =============");

		// * instantiate object of Bike Type and call Bike class methods
		Bike bike = new Bike();
		bike.vehicleType();
		bike.color();
		System.out.println("Bike Has number of Gears" + " "
				+ bike.getNumberOfGears() + " " + "and" + " "
				+ bike.getNumberOfWheels() + "" + " Number of wheels");

	}

}
