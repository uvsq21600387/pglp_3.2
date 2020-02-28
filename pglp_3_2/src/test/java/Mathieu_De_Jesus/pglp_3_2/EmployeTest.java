package Mathieu_De_Jesus.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {

	@Test
	public void testCalcul() throws Exception {
		Employe e = new Employe(2010,2020);
		assertTrue(e.calculSalaire() == 1500 + (2020 - 2010) * 20);
	}

	@Test
	public void testSetter() throws Exception {
		Employe e = new Employe(2010,2020);
		e.setAnneeCourante(2021);
		assertTrue(e.calculSalaire() == 1500 + (2021 - 2010) * 20);
	}
	
	@Test (expected = Exception.class)
	public void testEchecSetter() throws Exception {
		Employe e = new Employe(2010,2020);
		e.setAnneeCourante(2000);
	}
	
	@Test (expected = Exception.class)
	public void testEchecConstructor() throws Exception {
		@SuppressWarnings("unused")
		Employe e = new Employe(2010,200);
	}
}
