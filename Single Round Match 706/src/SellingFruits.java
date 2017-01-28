import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SellingFruits {
	
	public int maxDays(int x, int f, int d, int p) {
		long high = (int)2e9 + 1;
		long low = 1;
		long ans = 0;
		while(low < high) {
			long mid = ((long)low + (long)high) / 2;
			if (canLive(x, f, d, p, mid)) {
				low = mid + 1;
				ans = mid;
			}
			else {
				high = mid;
			}
		}
		return (int)ans;
	}
	public boolean canLive(int x, int f, int d, int p, long days){
		long moneyreq = (long)days * x;
        if (moneyreq <= d) {
			long moneyrem = d - moneyreq;
			long numfruits = f + (moneyrem / p);
			if (numfruits >= days) {
				return true;
			}
			return false;
		}
		return false;
	}
}
