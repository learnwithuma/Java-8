// Double colon operator - Method reference and constructor Reference

interface Bike {
	public String getName();
}

class Engine {
	Engine() {
		System.out.println("Engine is created !!");
	}
}

interface NewBike {
	public Engine getEngine();
}

class Honda {
	public static String printName() {
		return "Honda - static";
	}

	public String displayName() {
		return "Honda - instance";
	}

	public static void main(String args[]) {
		
		// Method Reference - Static Methods
		Bike b1 = Honda::printName;
		System.out.println(b1.getName());

		// Method Reference - Instance Methods
		Honda h = new Honda();
		Bike b2 = h::displayName;
		System.out.println(b2.getName());
		
		// Without Constructor Reference
		NewBike b3 = () -> new Engine() ;
		b3.getEngine();
		
		// Constructor Reference
		NewBike b4 = Engine :: new;
		b4.getEngine();
	}
}
