package model;

public class Car {
	private String brand;
	private String model;
	private int birthYear;
	private String color = "black";

	public void setBrand(String entreeBrand) {
		brand = entreeBrand;
	}

	public String getBrand() {
		return brand;
	}

	public void setModel(String entreeModel) {
		model = entreeModel;
	}

	public String getModel() {
		return model;
	}

	public void setBirthYear(int entreeBirthYear) {
		birthYear = entreeBirthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", birthYear=" + birthYear + ", color=" + color + "]";
	}
	
}
