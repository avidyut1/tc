import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearPaints {
	
	public long maxArea(int W, int H, long M) {
		long res = (long)W * H;
		if (res <= M) {
			return res;
		}
		else {
			res = 0;
			for (int i = 1; i <= W; i++) {
				long j = Math.min(H, M/i);
				res = Math.max(i*j, res);
			}
		}
		return res;
	}
}
