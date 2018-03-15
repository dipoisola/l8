package l8.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Marketing> marketers = new ArrayList<Marketing>();
		
		marketers.add(new Marketing("Mahmud", "Klin", 1430.50));
		marketers.add(new Marketing("Joshua", "Black Suede", 11.50));
		marketers.add(new Marketing("Chrisner", "Suave Lotion", 1091.50));
		marketers.add(new Marketing("James", "Suave Lotion", 1011.50));
		
		Comparator<Marketing> marketingComparator = new SalesAmountComparator();
		Collections.sort(marketers, marketingComparator);
		System.out.println(marketers);
		
		List<Marketing> m1000List = MoreThan1000Comparator.listMoreThan1000(marketers);
		Comparator<Marketing> moreThan1000 = new MoreThan1000Comparator();
		Collections.sort(m1000List, moreThan1000);
		System.out.println(m1000List);
		
		marketers.remove(2);
		
		marketers.set(1, new Marketing("Yetunde", "Big Stout", 10.00));
		System.out.println(marketers.size());
		System.out.println(marketers);
		
	}

}
