import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ConnectingCars {
	
	public long minimizeCost(int[] positions, int[] lengths) {
		long min = Long.MAX_VALUE;
		int n = positions.length;
		PositionLength ar[] =  new PositionLength[n];
		for (int i = 0; i < n; i++) {
			ar[i] = new PositionLength(positions[i], lengths[i]);
		}
		Arrays.sort(ar);
		for (int i = 0; i < n; i++) {
			long ans = 0;
			int right = ar[i].p + ar[i].l;
			for (int j = i + 1; j < n; j++) {
				ans += Math.abs(right - ar[j].p);
				right += ar[j].l;
			}
			int leftc = ar[i].p;
			for (int j = i - 1; j >= 0; j--) {
				ans += Math.abs(leftc - (ar[j].p + ar[j].l));
				leftc -= ar[j].l;
			}
			min = Math.min(min, ans);
		}
		return min;
	}
}
class PositionLength implements Comparable<PositionLength>{
	int p, l;
    public PositionLength(int p, int l) {
		this.p = p;
		this.l = l;
	}
	public int compareTo(PositionLength that) {
		return this.p - that.p;
	}
}