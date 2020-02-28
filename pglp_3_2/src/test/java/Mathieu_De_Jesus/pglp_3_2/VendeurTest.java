package Mathieu_De_Jesus.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void test() {
		Vendeur v = new Vendeur(100);
		assertTrue(v.calculSalaire() == 1500 + 100);
	}

}
