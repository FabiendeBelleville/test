package lanceur;

import java.util.ArrayList;
import java.util.List;

import model.Chat;
import model.Animal;
import model.Felin;
import model.Poule;

public class Main2 {

	public static void main(String[] args) {

		List<Animal> liste = new ArrayList<>();

		Chat c1 = new Chat();
		liste.add(c1);

		Felin f1 = new Felin();
		liste.add(f1);

		Poule p1 = new Poule();
		liste.add(p1);
		liste.add(new Poule());
		liste.add(new Poule());
		liste.add(new Poule());
		liste.add(new Poule());
		liste.add(new Animal());
		liste.add(new Poule());

		p1.crie();

		for (Animal animal : liste) {
			animal.crie();
		}
	}
}
