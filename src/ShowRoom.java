// Lambda Expression

interface Car {
	public void getName();
}

class Audi implements Car {
	public void getName() {
		System.out.println("Audi");
	}
}

class Hyundai implements Car {
	public void getName() {
		System.out.println("Hyundai");
	}
}

class ShowRoom {
	public static void main(String args[]) {
		System.out.println("Without Lambda Expression");
		Car car = new Audi();
		car.getName();

		System.out.println("With Lambda Expression");
		Car car1 = () -> System.out.println("Honda");
		car1.getName();
	}
}
