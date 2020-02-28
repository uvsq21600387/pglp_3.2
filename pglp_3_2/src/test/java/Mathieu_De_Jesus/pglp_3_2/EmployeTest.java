package Mathieu_De_Jesus.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {

	@Test
	public void testCalcul() {
		Employe e = new Employe(2010,2020);
		assertTrue(e.calculSalaire() == 1500 + (2020 - 2010) * 20);
	}

	@Test
	public void testSetter() {
		Employe e = new Employe(2010,2020);
		e.setAnneeCourante(2021);
		assertTrue(e.calculSalaire() == 1500 + (2021 - 2010) * 20);
	}
}
