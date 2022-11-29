package studio9;

import assignment7.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;


public class UniversityDatabase {
	private final Map<String,Student> map1;

	public UniversityDatabase() { //constructor
		map1 = new HashMap<String,Student>();
	}
	
	public void addStudent(String accountName, Student student) {
		map1.put(accountName, student);
	}

	public int getStudentCount() {
		return map1.size();
	}

	public String lookupFullName(String accountName) {
		if(map1.get(accountName) == null) {
			return null;
		}
		else {
			return map1.get(accountName).getFullName();
		}
	
	}

	public double getTotalBearBucks() {
		double sum = 0;
		for(String key: map1.keySet()) {
			sum+=  map1.get(key).getBearBucksBalance();
		}
		return sum;
	}
}
