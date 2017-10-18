import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LastDigit {
	
	public long findX(long S) {
		long l = 1l; long h = (long)10e18;
		while(l < h) {
			long mid = (l + h) / 2;
			long val = sum(mid);
			if (val == S) {
				return mid;
			}
			if(val > S) {
				h = mid;
			}
			else {
				l = mid + 1;
			}
		}
		return -1;
	}
	public long sum(long n) {
		long sum = 0l;
		while(n > 0) {
			sum += n;
			n /= 10;
		}
		return sum;
	}
}
