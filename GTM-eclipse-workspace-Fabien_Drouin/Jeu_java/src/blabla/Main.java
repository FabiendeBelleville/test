package blabla;

public class Main {
	public static void main(String[] args) {

		Player player1 = new Player("Gérard", 20, 30);
		player1.damage(15);
		player1.setAttack(10);
		System.out.println("Nom : " + player1.getName());
		System.out.println("vie : " + player1.getHealth());
		System.out.println("Points d'attaque : " + player1.getAttack());

		System.out.println("");
		Player player2 = new Player("Roger", 20, 20);
		player2.setName("Georges-Roger");
		player2.damage(player1.getAttack());
		System.out.println("Nom : " + player2.getName());
		System.out.println("vie : " + player2.getHealth());
		System.out.println("Points d'attaque : " + player2.getAttack());

	}
}
