package model;

public class Person {

	public String name;
	public int age;
	public Car car = new Car();

	public void saluer() {
		System.out.println("Salut ! Je m'appelle " + name + " et j'ai " + age + " ans.");
		System.out.println("As-tu vu le dernier film de Xavier Dolan ?");
		System.out.println("Franchement, c'est le Justin Bieber du cinéma ce mec !");
		System.out.println("Au fait, j'ai acheté une " + car.brand);

	}

}
