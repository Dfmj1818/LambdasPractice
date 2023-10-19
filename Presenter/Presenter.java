package Presenter;

import java.util.List;

import Exceptions.EmptyListException;
import Model.Car;
import Model.CarManager;
import Model.Sort;
import View.View;


public class Presenter {

	private CarManager carManager;
	private View view;
    private Sort sort;
    
	public Presenter() {
		carManager=new CarManager();
		view=new View();
		sort=new Sort();
	}
	public static void main(String[]args) {
		Presenter presenter=new Presenter();
	    presenter.sortNumbers();
		
	}
	
	public void sortNumbers() {
		sort.addNumbersToList();
		List<Integer>numbersList=sort.sortNumbers();
		view.showAllTypesOfLists(numbersList);
	}
	

	public void runApp() {
		int digitedOption;
		String digitedBrand="";
		String digitedColour;
		view.showMessage("Pruebas de filtrado en java");
		view.showMessage("Escoga por cual caracteristica desea filtrar su auto");
		view.showMessage("1.Marca\n2.Color\n3.Placa");
		digitedOption=view.readInt();
		switch(digitedOption){
		case 1:
			view.showMessage("Digita la marca que desea filtrar tu auto");
			digitedBrand=view.readString();
			List<Car>filteredCarsByBrand=carManager.filterCarsByBrand(digitedBrand);
			if(!filteredCarsByBrand.isEmpty()){
				view.showList(filteredCarsByBrand);
			}
			else {
				throw new EmptyListException();
			}
			
			break;
		case 2:
            view.showMessage("Digita el color por el que deseas filtrar tu auto");
			digitedColour=view.readString();
			List<Car>filteredCarsByColour=carManager.filterCarsByColour(digitedColour);
			if(!filteredCarsByColour.isEmpty()){
				view.showList(filteredCarsByColour);
			}
			else {
				throw new EmptyListException();
			}
			
			break;
		case 3:


			break;

		}

	}
}
