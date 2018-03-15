package l8.three;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoreThan1000Comparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing m1, Marketing m2) {
		if (m1.getEmployeename().equals(m2.getEmployeename())) {
			if (m1.getProductname().equals(m2.getProductname())) {
				return (int) (m1.getSalesamount() - m2.getSalesamount());
			}
			
			return m2.getProductname().compareTo(m1.getProductname());
		}
		
		return m1.getEmployeename().compareTo(m2.getEmployeename());
	}
	
	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		List<Marketing> newList = new ArrayList<Marketing>();
		
		for (Marketing m : list) {
			if (m.getSalesamount() > 1000) {
				newList.add(m);
			}
		}
		
		return newList;
	}
}
