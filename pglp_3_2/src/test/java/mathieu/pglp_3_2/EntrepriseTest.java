package mathieu.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * tests unitaires de la classe Entreprise.
 */
public class EntrepriseTest {

	@Test
	/**
	 * teste le constructeur de la classe.
	 */
	public void test() {
		Entreprise e = new Entreprise();
		assertTrue(e.calculSalaireSalaries() == 0);
	}

	@Test
	/**
	 * teste le calcul du salaire global versés aux salariés
	 * avec un vendeur et un employé.
	 * @throws Exception si les valeurs d'années de l'employés sont incorrects
	 */
	public void testCalcul() throws Exception {
		Entreprise e = new Entreprise();
		e.addSalarie(new Vendeur(1000)); //salaire = 2500
		e.addSalarie(new Employe(2000,2020)); //salaire = 1900
		
		assertTrue(e.calculSalaireSalaries() == 2500 + 1900);
	}
	
	@Test
	/**
	 * teste le calcul du salaire global versés aux salariés
	 * avec un vendeur et un employé et un manager.
	 * @throws Exception si les valeurs d'années de l'employés sont incorrects
	 */
	public void testCalculAvecManager() throws Exception {
		Entreprise e = new Entreprise();
		e.addSalarie(new Vendeur(1000)); //salaire = 2500
		e.addSalarie(new Employe(2000,2020)); //salaire = 1900
		e.addSalarie(new Manager(2)); //salaire = 1700
		
		assertTrue(e.calculSalaireSalaries() == 2500 + 1900 + 1700);
	}
}
