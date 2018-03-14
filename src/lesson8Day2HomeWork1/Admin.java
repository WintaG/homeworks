package lesson8Day2HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List<Student> studentList = new ArrayList<>();
		for (Object d : studentArray) {
			Student student = (Student) d;
			studentList.add(student);
		}
		return studentList;

	}

	public static double computeAverageGpa(List<Student> studentList) {

		double computeGpa = 0.0;
		for (Student d : studentList) {
			computeGpa += d.computeGpa();
		}
	
		return computeGpa / studentList.size();
	}
}
