package Mathieu_De_Jesus.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * tests unitaire de la classe Employé.
 */
public class EmployeTest {

	@Test
	/**
	 * teste le calcul du salaire.
	 * @throws Exception si le constructeur échoue
	 */
	public void testCalcul() throws Exception {
		Employe e = new Employe(2010,2020);
		assertTrue(e.calculSalaire() == 1500 + (2020 - 2010) * 20);
	}

	@Test
	/**
	 * teste le setter de l'année courante.
	 * @throws Exception si le constructeur ou le setter échoue
	 */
	public void testSetter() throws Exception {
		Employe e = new Employe(2010,2020);
		e.setAnneeCourante(2021);
		assertTrue(e.calculSalaire() == 1500 + (2021 - 2010) * 20);
	}
	
	@Test (expected = Exception.class)
	/**
	 * teste si le setter échoue si l'année courante < année d'embauche.
	 * @throws Exception le setter échoue
	 */
	public void testEchecSetter() throws Exception {
		Employe e = new Employe(2010,2020);
		e.setAnneeCourante(2000);
	}
	
	@Test (expected = Exception.class)
	/**
	 * teste si le constructeur échoue si l'année courante < année d'embauche.
	 * @throws Exception le constructeur échoue
	 */
	public void testEchecConstructor() throws Exception {
		@SuppressWarnings("unused")
		Employe e = new Employe(2010,200);
	}
}
