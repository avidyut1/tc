import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearChairs {

	public int[] findPositions(int[] atLeast, int d) {
		int n = atLeast.length;
		d--;
		int seat[] = new int[n];
		seat[0] = atLeast[0];
		Vector<RangeFilled> r = new Vector<RangeFilled>();
		r.add(new RangeFilled(seat[0] - d, seat[0] + d));
		for (int i = 1; i < n; i++) {
			int s = atLeast[i];
			int prev = s;
			while(true) {
				prev = inRange(r, prev);
				if (prev == -1)
					break;
				s = prev;
			}
			seat[i] = s;
			r.add(new RangeFilled(s - d, s + d));
		}
		return seat;
	}
	public int inRange(Vector<RangeFilled> r, int s) {
		for (RangeFilled rf : r) {
			if (rf.l <= s && rf.r >= s) {
				return rf.r + 1;
			}
		}
		return -1;
	}
}
class RangeFilled{
	int l; int r;
	public RangeFilled(int l, int r){
		this.l = l;
		this.r = r;
	}
}