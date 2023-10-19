package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarManager {
	private List<Car>carsList;

	public CarManager() {
		carsList=new ArrayList<Car>();
	}

	public void addCarToList(Car car){
		carsList.add(car);
	}

	public void removeCar(int idToRemove){
		carsList.removeIf(car->car.getId()==idToRemove);
	}

	public void createCars() {
		Car car=new Car(513,"Rosa","Mazda");
		Car car2=new Car(657,"Verde","Chevrolet");
		Car car3=new Car(654,"Azul","Renault");
		Car car4=new Car(344,"Morado","Peugeot");
		Car car5=new Car(211,"rosado","Chevrolet");
		Car car6=new Car(111,"Verde","Chevrolet");
		carsList.add(car);
		carsList.add(car2);
		carsList.add(car3);
		carsList.add(car4);
		carsList.add(car5);
		carsList.add(car6);
	}

	public List<Car>filterCarsByBrand(String digitedBrand){
		return carsList.stream()
		.filter(car->car.getBrand().equalsIgnoreCase(digitedBrand))
		.collect(Collectors.toList());
	}
	
	public List<Car>filterCarsByColour(String digitedColour){
		return carsList.stream()
		        .filter(car->car.getColour().equalsIgnoreCase(digitedColour))
		        .collect(Collectors.toList());
	}
	
	public List<Car>filterCarsById(int digitedId){
		return carsList.stream()
		        .filter(car->car.getId()==digitedId)
		        .collect(Collectors.toList());
		
	}
	
	


}
