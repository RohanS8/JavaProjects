package gg; 

/*Student id: 4537820
*Student name:Rohandeep Singh
*Topic Inheritance
*/

class sportscars{
	String manufacturer;
}

class suv extends sportscars{
	int passengercount;
}

class sedan extends sportscars{
	String model;
}

public class Vehicles {
	public static void main(String[] args) {
		suv z = new suv();
		z.manufacturer = "Mazda";
		z.passengercount = 5;
		System.out.println("SUV Details");
		System.out.println("------------");
		System.out.println("Manufacturer Name: " + z.manufacturer);
		System.out.println("Passenger Count: " + z.passengercount);
		
		sedan x = new sedan();
		x.manufacturer = "Mazda";
		x.model = "Mazda MX-5";
		System.out.println("\nSedan Details");
		System.out.println("------------");
		System.out.println("Manufacturer Name: " + x.manufacturer);
		System.out.println("Model Name: " + x.model);
	}
}
