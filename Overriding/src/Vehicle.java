
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.move();
		Bike bike = new Bike();
		bike.move();
	}
	public void move() {
		System.out.println("The vechicle is moving");
	}
}
