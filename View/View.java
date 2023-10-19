package View;

import java.util.List;
import java.util.Scanner;
import Exceptions.EmptyDataEnteredException;
import Exceptions.EmptyListException;
import Model.Car;

public class View {
	private Scanner scanner;

	public View() {
		scanner=new Scanner(System.in);
	}

	public void showMessage(String message){
		if(!message.isEmpty()){
			System.out.println(message);
		}
		else {
			throw new EmptyDataEnteredException();
		}

	}

	public String readString() {
		String input=scanner.nextLine().trim();
		if(!input.isEmpty()){
			return input;
		}
		else {
			throw new EmptyDataEnteredException();
		}
	}

	public int readInt() {
		String inputAsString=scanner.nextLine().trim();
		int input = 0;
		if(!inputAsString.isEmpty()){
			try {
				input=Integer.parseInt(inputAsString);
			}catch(NumberFormatException e){
				showMessage("Ingresa un numero entero,Valido");
			}
		}
		else {
			throw new EmptyDataEnteredException();	
		}
		return input;
	}
    
	
	public void showList(List<Car>carsList){
		if(!carsList.isEmpty()){
			carsList.forEach(car->System.out.println(car));
		}
		else {
			throw new EmptyListException();
		}
			
	}
	
	public void showAllTypesOfLists(List<?>list){
		list.forEach(element->System.out.println(element));
	}

}
