package model;

public class Person {
	private String name;
	private String surname;
	private int birthYear;
	private String numCB = "XXXX XXXX XXXX XXXX";

	// constructeur par default
	public Person() {
		this("Cassel", "Vincent", 1966, "4585 4585 6325 6589");
	}

	// constructeur qui prend tout
	public Person(String name, String surname, int birthYear, String numCB) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.numCB = numCB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getNumCB() {
		return numCB;
	}

	public void setNumCB(String numCB) {
		this.numCB = numCB;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", birthYear=" + birthYear + ", numCB=" + numCB + "]";
	}

}
