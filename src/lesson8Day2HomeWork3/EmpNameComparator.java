package lesson8Day2HomeWork3;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing m1, Marketing m2) {

		return m1.getEmployeename().compareTo(m2.getEmployeename());

	}

}
