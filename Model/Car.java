package Model;

public class Car {
	private int id;
	private String colour;
	private String brand;

	public Car(int id,String colour,String brand){
		this.id=id;
		this.colour=colour;
		this.brand=brand;
	}

	public String getColour() {
		return colour;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		StringBuilder carInformation=new StringBuilder();
		carInformation.append("Placa: ").append(getId()).append("\n")
		.append("Color:" ).append(getColour()).append("\n")
		.append("Marca: ").append(getBrand());

		return carInformation.toString();
	}
	

}
