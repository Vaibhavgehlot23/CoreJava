package SortingMarksheet;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {

	public static void main(String[] args) {
		ArrayList marksheets = new ArrayList();

		marksheets.add(new Marksheet("1", "Ajay", "verma", 49));
		marksheets.add(new Marksheet("6", "Vijay", "ray", 48));
		marksheets.add(new Marksheet("3", "Chintu", "rao", 39));
		marksheets.add(new Marksheet("4", "Vijay", "sharma", 43));
		marksheets.add(new Marksheet("9", "Ajay", "rawat", 45));
		marksheets.add(new Marksheet("11", "Vijay", "patidar", 41));
		marksheets.add(new Marksheet("7", "Vijay", "sharma", 32));

		Collections.sort(marksheets, new OrderbyCondition());
		for (Object o : marksheets) {
			System.out.println(o);
		}
	}
}
