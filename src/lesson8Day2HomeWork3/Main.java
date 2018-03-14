package lesson8Day2HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	static List<Marketing> MarketingList = new ArrayList<>();

	public static void main(String[] args) {
		Main main= new Main();
		
		Marketing m0=  new Marketing("winta","samsung", 3900);
		Marketing m1=  new Marketing("helen","samsung", 900);
		Marketing m2=  new Marketing("sam","samsung", 8900);
		Marketing m3=  new Marketing("bob","samsung", 700);
		Marketing m4=  new Marketing("xxx","samsung", 1000);
		Marketing m5=  new Marketing("yyy","samsung", 8000);
		
		MarketingList.add(m0);
		MarketingList.add(m1);
		MarketingList.add(m2);
		MarketingList.add(m3);
		MarketingList.add(m4);
		
		
		System.out.println("Main list: \n" + main.MarketingList);
		main.sort();
		System.out.println("\n Sorted: \n" + main.MarketingList);
		List<Marketing> at = main.sortByEName(1000);
		
		System.out.println("\n filtered: \n" + at);
		
	
	}
	
	
	
  

	public void add(Marketing mElement) {
		MarketingList.add(mElement);

	}

	public void remove(Marketing mElement) {
		MarketingList.remove(mElement);

	}

	public void set(int index, Marketing mElement) {
		MarketingList.set(index, mElement);

	}

	public void printSize() {

		System.out.println("MarketingList:" + MarketingList.size());

	}

	public void sort() {
		SalesComparetor sc = new SalesComparetor();
		Collections.sort(MarketingList, sc);
	}

	public List<Marketing> sortByEName(double amount) {
		EmpNameComparator enc = new EmpNameComparator();
		List<Marketing> filtered = filter(amount);
		Collections.sort(filtered, enc);
		return filtered;
	}

	public List<Marketing> filter(double amount) {
		List<Marketing> filteredList = new ArrayList<>();
		for (Marketing m : MarketingList) {
			if (m.getSalesamount() >= amount) {
				filteredList.add(m);
			}
		}
		return filteredList;

	}

	@Override
	public String toString() {
		String mList = "MarketingLis [";
		for (Marketing m : MarketingList) {
			mList += m.getEmployeename() + "," + m.getProductname() + ", " + m.getSalesamount() + "\n";
		}
		return mList + "]";

	}

}
