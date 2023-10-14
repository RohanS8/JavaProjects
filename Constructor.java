package gg;

/*Student id: 4537820
*Student name:Rohandeep Singh
*Topic Inheritance
*/

public class Constructor {
	
	int marks;
	String course;
	
	Constructor(){
		System.out.println("Exmaple for constructor");
	
	}
	
	Constructor(int a, String b ){
		System.out.println("Age: " + a);
		System.out.println("Name: " + b);
	}
	
	Constructor(String a, int marks){
		course = a;
		System.out.println("Course name: " + course);
		System.out.println("Course marks: " + marks);
	}
	
	public static void main(String[] args) {
		Constructor z = new Constructor();
		Constructor x = new Constructor(19, "Rohan");
		Constructor y = new Constructor("Programming", 95);
	}
}
