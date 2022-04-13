package oop;


//inheritance
//parent class
class Race {

	public void display() {

		System.out.println("Racing event");
	}

}

//sub class
class BikeRace extends Race {

	@Override

	public void display() {

		System.out.println("Bike Racing event");

	}

	public int raceSpeed(int distance, int time) {

		return distance / time;

	}

//Overload

	public double raceSpeed(double distance, double time) {

		return distance / time;
	}

}

//encapsulation example

class Rider {

	private String name;

	public String getName() {

		return name;

	}

	public void setName(String newName) {

		name = newName;

	}

}

//abstraction

abstract class TwoWheeler {

	public abstract void run();

}

class Bike extends TwoWheeler {

	public void run() {

		System.out.println("bike is Running..");

	}

}

//main class
class MainClass {

	public static void main(String[] args) {

		Race race = new Race();

		race.display();

		BikeRace bikeRace = new BikeRace();

		bikeRace.display();

		// polymorphism

		Rider rider = new Rider();
		rider.setName("John Ibrahim");

		System.out.println("Rider Name : " + rider.getName());
		TwoWheeler twoWheeler = new Bike();

		twoWheeler.run();

       //Method overload		

		System.out.println("Speed : "+bikeRace.raceSpeed(10000, 89)+" mps");
		System.out.println("Speed : "+bikeRace.raceSpeed(10000, 89.5)+" mps");

	}
}
