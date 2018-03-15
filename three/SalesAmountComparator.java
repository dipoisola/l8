package l8.three;

import java.util.Comparator;

public class SalesAmountComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing m1, Marketing m2) {
		if (m1.getSalesamount() == m2.getSalesamount()) {
			if (m1.getEmployeename().equals(m2.getEmployeename())) {
				return m2.getProductname().compareTo(m1.getProductname());
			}
			
			return m2.getEmployeename().compareTo(m1.getEmployeename());
		}
		
		return (int) (m1.getSalesamount() - m2.getSalesamount());
	}

}
