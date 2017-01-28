import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class QuadraticLaw {
	
	public long getTime(long d) {
		long l = 0;
		long r = (long)1e9 + 1;
		long ans = l;
		while(l < r) {
			long mid = (l + r) >> 1;
			if (ok(mid, d)) {
				ans = mid;
				l = mid + 1;
			}
			else {
				r = mid;
			}
		}
		return ans;
	}
	public boolean ok(long late, long d) {
		if (d - (late + (late * late)) >= 0) {
			return true;
		}
		return false;
	}
}
