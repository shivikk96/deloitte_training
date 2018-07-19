package Inheritance;

abstract class Vehicle {

	int price;
	public Vehicle() {
	System.out.println("Vehcle cons ");
	}
	public abstract void start();
	public abstract void stop();
	public void music() {System.out.println("Music");}
	
	
}
class Car extends Vehicle
{

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
		
	}
	
}
public class Main
{
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		v.stop();
	}
}

