import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SquareMaking {
	
	public int getMinimalPrice(int a, int b, int c, int d) {
        int ar[] = new int[]{a, b, c, d};
		Arrays.sort(ar);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            int lans = 0;
            for (int j = 0; j < ar.length; j++) {
                lans += Math.abs(ar[i] - ar[j]);
            }
            ans = Math.min(lans, ans);
		}
		return ans;
	}
}
