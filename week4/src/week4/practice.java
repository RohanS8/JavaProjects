package week4;
import java.util.Scanner;
/*Student id:
 * Student name:
 * faculty name:Sumthira
 * */

public class practice {
	
	static void display(){
		System.out.println("Hello World");
	}
	
	public void sum(int a, int b) {
		int s = 0;
		for(int i = a; i <= b; i++) {
			s += i;
		}
		System.out.println("The sum from " + a + " to " + b + " is " + s);
	}
	
	public static int total(int i1, int i2) {
		int sum = 0;
		for(int i = i1; i <= i2; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		display();
		practice z = new practice();
		z.sum(10,20);
		System.out.println("The sum from 1 to 10 is " + total(1,10));
		
		}


	}

