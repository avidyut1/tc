import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NumberGameAgain {
	Vector<Long> visited = new Vector<>();
	public long solve(int k, long[] table) {
        Arrays.sort(table);
		long x = 1l;
		long level[] = new long[41];
		level[0] = 1l;
		for (int i = 1; i < 41; i++) {
			level[i] = (long)Math.pow(2, i);
			level[i] += level[i - 1];
		}
		long ans = (long)Math.pow(2, k) - 1;
		long total = ans;
		System.out.println(total);
		System.out.println(ans);
		for (int i = 0; i < table.length; i++) {
			long node = table[i];
			boolean sub = false;
			int lv = 0;
			while(node != 1) {
				node /= 2;
				if (Arrays.binarySearch(table, node) >= 0) {
					sub = true;
				}
				lv++;
			}
			if (sub) {
				continue;
			}
			System.out.println(lv);
			System.out.println(total - level[lv]);
			ans -= (total - level[lv]);
		}
		return ans;
	}
}
