package Mathieu_De_Jesus.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void test() {
		Manager m = new Manager(2);
		assertTrue(m.calculSalaire() == 1500 + 200);
	}

}
