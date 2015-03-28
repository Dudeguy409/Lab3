import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class PrimeFactorizationTest {

	private List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactorization.generate(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertEquals(list(2), PrimeFactorization.generate(2));
	}

	@Test
	public void testThree() throws Exception {
		assertEquals(list(3), PrimeFactorization.generate(3));
	}
	
	@Test
	public void testFour() throws Exception {
		assertEquals(list(2 , 2), PrimeFactorization.generate(4));
	}
	
	@Test
	public void testSix() throws Exception {
		assertEquals(list(2 , 3), PrimeFactorization.generate(6));
	}
	
	@Test
	public void testEight() throws Exception {
		assertEquals(list(2 , 2, 2), PrimeFactorization.generate(8));
	}
}
