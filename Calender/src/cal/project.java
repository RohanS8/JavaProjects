package cal;
import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		String year = myObj.nextLine();
		
		System.out.println("Enter Month Number: ");
		String month = myObj.nextLine();
		
		String[] months = {
						   "January",
		                   "February",
		                   "March",
		                   "April",
		                   "May",
		                   "June",
		                   "July",
		                   "August",
		                   "September",
		                   "October",
		                   "November",
		                   "December"};
		
		int i=Integer.parseInt(month);
		i -= 1;
		String usermon = months[i];
		
		String days = "Mon Tue Wed Thur Fri Sat Sun";
		
		String dates = "1  2  3  4  5  6  7\n8  9  10  11  12  13  14\n15  16  17  18  19  20  21\n22  23  24  25  26  27  28\n29 20";
		
		System.out.println("      " + usermon + "   " + year);
		System.out.println("--------------------------");
		System.out.println(days);
		System.out.println(dates);
	}
}
