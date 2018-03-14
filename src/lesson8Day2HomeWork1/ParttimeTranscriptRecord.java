package lesson8Day2HomeWork1;
import java.util.*;
public class ParttimeTranscriptRecord {
	private List<Double> grades = new ArrayList<>();
	public void insertGrade(double val) {
		grades.add(val);
	}
	
	public List<Double> getRecord() {
		return grades;
	}
}
