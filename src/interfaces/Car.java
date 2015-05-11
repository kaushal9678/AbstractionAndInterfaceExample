/**
 * 
 */
package interfaces;

/**
 * @author kaushlendra
 *
 */
public class Car implements Ford, Suzuki {

	@Override
	public void getBody() {
		// TODO Auto-generated method stub
		System.out.println("Car body is of type Aluminium");
	}

	@Override
	public void getEngine() {
		// TODO Auto-generated method stub
		System.out.println("car engine is of petro type");
		
	}

	@Override
	public void getEngineVersion() {
		// TODO Auto-generated method stub
		System.out.println("petro version 1.6");
	}


}
