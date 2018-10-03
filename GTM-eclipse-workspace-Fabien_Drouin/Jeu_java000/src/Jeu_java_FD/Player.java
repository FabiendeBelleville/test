package Jeu_java_FD;

public class Player {
	private String name = "FaFOu";
	private int health = 20;
	private int attack = 1;

	public Player(String name, int healt, int attack) {
		this.name = name;
		this.health = healt;
		this.attack = attack;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void damage(int damage) {
		this.health -= damage;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

}
