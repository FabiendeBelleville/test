package model;

public class Person {

	private String name;
	private int age;
	private String numCB = "XXXX XXXX XXXX XXXX";

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNumCB() {
		return numCB;
	}

	public void setAge(int entreeAge) {
		age = entreeAge;
	}

	public void setName(String entreeName) {
		name = entreeName;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", numCB=" + numCB + "]";
	}
}
