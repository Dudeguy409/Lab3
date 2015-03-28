import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

public class PrimeFactorizationTest {

	private List<Integer> list(Integer... integers) {
		// TODO Auto-generated method stub
		return Arrays.asList(integers);
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactorization.generate(1));
	}

	@Test
	public void testName() throws Exception {
		assertEquals(list(2), PrimeFactorization.generate(2));
	}

}
