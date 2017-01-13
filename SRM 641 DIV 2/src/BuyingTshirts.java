import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BuyingTshirts {
	
	public int meet(int T, int[] Q, int[] P) {
		int qtotal = 0;
		int ptotal = 0;
        int ans = 0;
		for (int i = 0; i < Q.length; i++) {
			qtotal += Q[i];
            ptotal += P[i];
            if (ptotal >= T && qtotal >= T) {
                ans++;
                ptotal -= T;
                qtotal -= T;
                continue;
            }
            if (ptotal >= T) {
                ptotal -= T;
            }
            if (qtotal >= T) {
                qtotal -= T;
            }
		}
		return ans;
	}
}
