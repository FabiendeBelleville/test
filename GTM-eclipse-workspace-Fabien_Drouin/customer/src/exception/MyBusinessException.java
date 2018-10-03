package exception;

public class MyBusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int id;

	public MyBusinessException(int id) {
		super("l'erreur vient de l'id " + id);
		System.out.println("probleme");
		this.id = id;
	}

	public double getid() {
		return id;
	}
}