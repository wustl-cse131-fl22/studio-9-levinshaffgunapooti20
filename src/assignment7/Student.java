package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private int attemptedCredits;
	private int passingCredits;
	private double totalPoints;
	private double bearBucks;
	
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = id;
		this.bearBucks = 0;
	}

	public String getFullName() {
		return (firstName + " " + lastName);
	}

	public int getId() {
		return studentID;
	}

	public void depositBearBucks(double amount) {
		bearBucks+=amount;
	}

	public double getBearBucksBalance() {
		return bearBucks;
	}
}
