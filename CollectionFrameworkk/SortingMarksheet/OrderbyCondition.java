package SortingMarksheet;

import java.util.Comparator;

public class OrderbyCondition implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {

		if (m1.getFname().equals(m2.getFname())) {
			return m1.getLastname().compareTo(m2.getLastname());
		} else {
			return m1.getFname().compareTo(m2.getFname());
		}

	}
}
