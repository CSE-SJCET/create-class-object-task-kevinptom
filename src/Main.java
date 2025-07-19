     // TODO: Create a class called Student with name, rollNumber, and grade

    // TODO: Create a method to display student details
class Student{
	String name;
	int rollNumber;
	char grade;
	Student(){
		name="David John";
		rollNumber= 50;
		grade = 'A';
	}
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Grade: "+grade);
	}
}
public class Main {
	public static void main (String[] args) {
		Student student= new Student();
		student.displayDetails();
	}

}
