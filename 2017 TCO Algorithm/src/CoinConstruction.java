import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CoinConstruction {
	
	public int[] construct(int k) {
		int len = 19;
        long pow10[] = new long[len];
		pow10[0] = 1L;
		for (int i = 1; i < len; i++) {
			pow10[i] = 10 * pow10[i - 1];
		}

		System.out.println(Arrays.toString(pow10));
		return null;
	}
}
