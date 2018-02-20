package Prime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeAppTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPrimeNum() {
		int expected = 13;
		int actual = PrimeApp.primeFinder(6);
		assertEquals(expected, actual);
	}

	@Test
	void testPrimeNum2() {
		int expected = 2;
		int actual = PrimeApp.primeFinder(1);
		assertEquals(expected, actual);
	}
	@Test
	void testPrimeNum3() {
		int expected = 29;
		int actual = PrimeApp.primeFinder(10);
		assertEquals(expected, actual);
	}
	@Test
	void testPrimeNum4() {
		int expected = 31;
		int actual = PrimeApp.primeFinder(11);
		assertEquals(expected, actual);
	}
}
