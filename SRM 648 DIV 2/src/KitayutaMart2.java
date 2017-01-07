import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class KitayutaMart2 {
	
	public int numBought(int K, int T) {
		int pow2[] = new int[30];
		pow2[0] = 1;
		for (int i = 1; i < pow2.length; i++) {
			pow2[i] = pow2[i - 1] * 2;
		}
		int price[] = new int[pow2.length];
		for (int i = 0; i < price.length; i++) {
			price[i] = pow2[i] * K;
		}
		int pricetilli[] = new int[pow2.length];
		for (int i = 0; i < pricetilli.length; i++) {
			pricetilli[i] = price[i];
			if (i - 1 >= 0) {
				pricetilli[i] += pricetilli[i - 1];
			}
		}
		int ind = Arrays.binarySearch(pricetilli, T);
		return ind + 1 ;
	}
}
