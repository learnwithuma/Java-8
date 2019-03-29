// Interface static methods
// To define general utility methods

interface Devices {
	public static void getMessage() {
		System.out.println("The device has to be switched off before leaving");
	}
}


// Invoke from implementation class
class Desktop implements Devices {
	public static void main(String args[]) {
		Devices.getMessage();
		Mobile m = new Mobile();
		m.getMessage();
	}
}


//Invoke from non-implementation class
class Mobile {
	public void getMessage() {
		Devices.getMessage();
	}
}

