package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
	private List<Integer>numbersList;

	public Sort() {
		numbersList=new ArrayList<Integer>();
	}

	public List<Integer>getNumbersList(){
		return numbersList;
	}

	public void addNumbersToList() {
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(500);
		numbersList.add(0);
		numbersList.add(4);
		numbersList.add(6);
	}

	public List<Integer>sortNumbers(){
		return numbersList.stream()
				.sorted()
				.collect(Collectors.toList());
	}
}
