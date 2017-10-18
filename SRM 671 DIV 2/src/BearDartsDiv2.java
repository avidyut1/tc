import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearDartsDiv2 {
	
	public long count(int[] w) {
		int sortw[] = new int[w.length];
		System.arraycopy(w, 0, sortw, 0, w.length - 1);
        int ans = 0;
        for (int i = 0; i < w.length; i++) {
            for (int j = i + 1; j < w.length; j++) {
                for (int k = j + 1; k < w.length; k++) {
                    int res = w[i] * w[j] * w[j];
                    if (Arrays.binarySearch(sortw, res) > k) {
                        ans++;
                    }
                }
            }
        }
        return ans;
	}
}
