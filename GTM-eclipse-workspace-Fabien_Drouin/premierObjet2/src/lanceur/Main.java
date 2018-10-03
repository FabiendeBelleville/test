package lanceur;

import model.Person;

public class Main {

	public static void main(String[] args) {
		System.out.println("Nom**************" + "*Age*" + "**********CB*****************");

		Person p1 = new Person();
		p1.setAge(32);
		p1.setName("Fabien");
		System.out.println(p1.getName() + "            " + p1.getAge() + "            " + p1.getNumCB());

		Person p2 = new Person();
		p2.setAge(31);
		p2.setName("Tanguy");
		System.out.println(p2.getName() + "            " + p2.getAge() + "            " + p2.getNumCB());

		
		System.out.println(p1);
		System.out.println(p2);
	}

}
