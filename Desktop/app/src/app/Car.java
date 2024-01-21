package app;


public class Car {
	private String make;
	private String model;
	private int year;

	public Car() {
		this.make = "Unknown";
		this.model = "Unknown";
		this.year = 0;
	}
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String toString() {
		return "Car{" +
	"make='" + make + '\'' +
	",model='" + model + '\'' +
	",year=" + year +'}';
	}

	}

 class CarApp {

	public static void main(String[] args) {
		Car defaultCar = new Car();
		{
			Car customCar = new Car("Toyota", "Camry", 2022);
			System.out.println("Default Car Details: " + defaultCar);
			System.out.println("Custom Car Details: " + customCar);
		}
	}
}



