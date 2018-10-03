package org.formation.formation.test;

import org.formation.formation.model.Employe;
import org.formation.formation.model.Manager;

public class MainTest {

	public static void main(String[] args) {
		Manager manager = new Manager(0,"Platini", "Michel");
		manager.demanderFormation("01-01-2015", "01-01-2016");

		Employe e = new Employe(0, "Bob", "bill");
		e.demanderFormation("jljklk", "jkghjk");

	}

}
