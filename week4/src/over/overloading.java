package over;

public class overloading {
	public void addition(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("The sum is "+ sum);
	}
	
	public void addition(int a, int b) {
		int sum = a+b;
		System.out.println("The sum is "+ sum);
	}
	
	public static void main(String[] args) {
		overloading z = new overloading();
		z.addition(10, 20);
		z.addition(10, 20, 30);
	}

}
