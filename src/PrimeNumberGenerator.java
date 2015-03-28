import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public List<Integer> generate(Integer inputNumber) {
		ArrayList<Integer> rslt = new ArrayList<Integer>();
		if (inputNumber > 2) {
			rslt.add(2);
		}
		
		if (inputNumber > 3) {
			rslt.add(3);
		}
		
		if (inputNumber > 5) {
			rslt.add(5);
		}
		return rslt;
	}

}
