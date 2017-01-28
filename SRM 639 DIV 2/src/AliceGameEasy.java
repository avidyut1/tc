import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AliceGameEasy {
	int MAX = (int)1e5 + 1;
	public long findMinimumValue(long x, long y) {
		long sum[] = new long[MAX];
		for (int i = 0; i < MAX; i++) {
			sum[i] = ((long)i * (i + 1)) / 2;
		}
		if (Arrays.binarySearch(sum, x + y) >= 0) {
            int turns = Arrays.binarySearch(sum, x + y);
			for (int turn = 1; turn <= turns; turn++) {
				if(canWin(turn, x, turns)) {
					return turn;
				}
			}
		}
		return -1;
	}
	public boolean canWin(int t, long x, int tt) {
		long firstt = ((long)t * (t + 1)) / 2;
		long lastt = (((long)tt * (tt + 1)) / 2) - ((long)(tt - t) * (tt - t + 1) / 2);
		if (x >= firstt && x <= lastt) {
			return true;
		}
		return false;
	}
}
