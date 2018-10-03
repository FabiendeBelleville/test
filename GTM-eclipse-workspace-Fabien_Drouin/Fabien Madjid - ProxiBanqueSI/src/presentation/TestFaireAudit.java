package presentation;

import service.ImplementationService;

public class TestFaireAudit {
	public static void main(String[] args) {
		// faire un audit
		ImplementationService audit1 = new ImplementationService();
		audit1.faireAudit();
	}
}
