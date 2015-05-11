/**
 * 
 */

/**
 * @author kaushlendra
 *
 *         This abstract class is a super class of such type of vehicle Bus,Car etc..
 *         which will have common properties of all the Vehicle such as: Car,
 *         Bus etc..
 */
public abstract class Vehicle {
	
	
	/**
	 * 
	 * this method used to describe the vehicle type. Is it Car, Bike, Bus,Truck, etc...
	 */
	public abstract void vehicleType();
	/**
	 * 
	 * this method used to describe the vehicle Color. Is it White, Black, silver, etc...
	 */
	public abstract void color();
	
	/**
	 * 
	 * this method used to describe the vehicle wheels. Whether vehicle contains two three or four wheels, etc...
	 */
	public  String getNumberOfWheels(){
		return "4";
	}
	/**
	 * 
	 * this method used to describe the vehicle Gears. Whether vehicle contains two three or four wheels, etc...
	 */
	public String getNumberOfGears(){
		return "4";
	}
}
