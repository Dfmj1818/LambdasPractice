package Exceptions;

public class EmptyDataEnteredException extends RuntimeException{
	
	public EmptyDataEnteredException() {
		super("La entrada esta Vacia");
	}

}
