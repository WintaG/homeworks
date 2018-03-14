package lesson8Day2HomeWork3;

import java.util.Comparator;

public class SalesComparetor implements Comparator<Marketing> {

	@Override
	public int compare(Marketing m1, Marketing m2) {
		
		if(Double.compare(m1.getSalesamount(), m2.getSalesamount()) != 0) {
			return Double.compare(m1.getSalesamount(), m2.getSalesamount());
			
	}else if(m1.getEmployeename().equals(m2.getEmployeename())){
			return m1.getEmployeename().compareTo(m2.getEmployeename());
	}else {
		return m1.getProductname().compareTo(m2.getProductname());
	}
		
	}
}

