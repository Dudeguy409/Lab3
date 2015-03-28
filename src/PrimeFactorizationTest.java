import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;


public class PrimeFactorizationTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(list(), PrimeFactorization.generate(1));
	}

	private List<Integer> list() {
		// TODO Auto-generated method stub
		return Arrays.asList();
	}

}
