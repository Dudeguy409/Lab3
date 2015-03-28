import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public List<Integer> generate(Integer inputNumber) {
		ArrayList<Integer> rslt = new ArrayList<Integer>();

		for (int i = 2; i < inputNumber; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				rslt.add(i);
			}
		}
		return rslt;
	}

}
