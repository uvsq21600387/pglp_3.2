package Mathieu_De_Jesus.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EntrepriseTest {

	@Test
	public void test() {
		Entreprise e = new Entreprise();
		assertTrue(e.calculSalaireSalaries() == 0);
	}

	@Test
	public void testCalcul() throws Exception {
		Entreprise e = new Entreprise();
		e.addSalarie(new Vendeur(1000)); //salaire = 2500
		e.addSalarie(new Employe(2000,2020)); //salaire = 1900
		
		assertTrue(e.calculSalaireSalaries() == 2500 + 1900);
	}
}
