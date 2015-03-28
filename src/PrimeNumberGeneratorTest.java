import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {
	private PrimeNumberGenerator primeNumberGenerator;
	private Integer inputNumber;
	private List<Integer> expectedResult;

	@Before
	public void initialize() {
		primeNumberGenerator = new PrimeNumberGenerator();
	}

	public PrimeNumberGeneratorTest(Integer inputNumber,
			List<Integer> expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { 2, list() }, { 3, list(2) }});
	}

	private static List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

	  @Test
	   public void testPrimeNumberGenerator() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      assertEquals(expectedResult, 
	      primeNumberGenerator.generate(inputNumber));
	   }

}
