package luchadoresJaponeses;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LuchadorTest {

	@Test
	public void dominioTotal() {
		Luchador L1 = new Luchador(300, 1500);
		Luchador L4 = new Luchador(330, 1690);

		assertTrue(L4.dominaA(L1));
	}

	@Test
	public void dominioPeso() {
		Luchador L1 = new Luchador(300, 1500);
		Luchador L2 = new Luchador(320, 1500);

		assertTrue(L2.dominaA(L1));
	}

	@Test
	public void dominioAltura() {
		Luchador L4 = new Luchador(330, 1690);
		Luchador L5 = new Luchador(330, 1540);

		assertTrue(L4.dominaA(L5));

	}

	@Test
	public void test() {
		PreTorneo torneo = new PreTorneo(10);

		torneo.agregar(new Luchador(300, 1500));
		torneo.agregar(new Luchador(320, 1500));
		torneo.agregar(new Luchador(299, 1580));
		torneo.agregar(new Luchador(330, 1690));
		torneo.agregar(new Luchador(330, 1540));
		torneo.agregar(new Luchador(339, 1500));
		torneo.agregar(new Luchador(298, 1700));
		torneo.agregar(new Luchador(344, 1570));
		torneo.agregar(new Luchador(276, 1678));
		torneo.agregar(new Luchador(289, 1499));

		assertArrayEquals(new int[] { 1, 2, 1, 6, 3, 3, 2, 5, 0, 0 }, torneo.calcularDominios());

	}
	
	@Test
	public void empate() {
		Luchador L1 = new Luchador(330, 1690);
		Luchador L2 = new Luchador(330, 1690);

		assertFalse(L1.dominaA(L2));
		assertFalse(L2.dominaA(L1));
	}
	
	@Test
	public void empateCombinado() {
		Luchador L1 = new Luchador(350, 1690);
		Luchador L2 = new Luchador(330, 1700);

		assertFalse(L1.dominaA(L2));
		assertFalse(L2.dominaA(L1));
	}

}
