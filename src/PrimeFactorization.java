import java.util.ArrayList;
import java.util.List;


public class PrimeFactorization {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(;i % 2 == 0; i /= 2 ){
			list.add(2);
		}
		if(i > 1)
			list.add(i);
		return list;
	}

}
