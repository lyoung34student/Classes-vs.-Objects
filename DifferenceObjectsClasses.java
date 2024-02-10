// Class definition
class Car {
	String make;
	String model;
	int year;

	// Attributes
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Car information
	public void displayInfo() {
		System.out.println("Car make: " + make);
		System.out.println("Car model: " + model);
		System.out.println("Car year: " + year);
	}
}

public class DifferenceObjectsClasses {
	public static void main(String[] args) {
		// Using the Car class
		Car myCar = new Car("Toyota", "Corolla", 2021);

		// Accessing info
		System.out.println("Object attributes:");
		System.out.println("Car make: " + myCar.make);
		System.out.println("Car model: " + myCar.model);
		System.out.println("Car year: " + myCar.year);

		// Car class
		Car anotherCar = new Car("Honda", "Civic", 2020);

		System.out.println("\nAnother car attributes:");
		System.out.println("Car make: " + anotherCar.make);
		System.out.println("Car model: " + anotherCar.model);
		System.out.println("Car year: " + anotherCar.year);

	}
}