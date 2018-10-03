package model;

public class Item {

	private double price;
	private String codeName;

	public Item(double price, String codeName) {
		super();
		this.price = price;
		this.codeName = codeName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

}
