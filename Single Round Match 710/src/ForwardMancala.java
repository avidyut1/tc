import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ForwardMancala {
	
	public int[] findMoves(int[] start) {
		int sumstones = 0;
		for (int i = 0; i < start.length; i++) {
			sumstones += start[i];
		}
		Vector<Integer>  ans = new Vector<>();
		while(!result(start, sumstones)) {
			int minind = minIndex(start);
			int val = start[minind];
			start[minind] = 0;
			ans.add(minind);
			minind++;
			while(val != 0) {
				if (minind >= start.length) {
					minind %= start.length;
				}
				start[minind]++;
				minind++;
				val--;
			}
		}
		int ar[] = new int[ans.size()];
		int i = 0;
		for(int res: ans) {
			ar[i++] = res;
		}
		return ar;
	}
	public boolean result (int s[], int sums) {
		for (int i = 0; i < s.length; i++) {
			if (sums == s[i]) {
				return true;
			}
		}
		return false;
	}
	public int minIndex (int s[]) {
		int minval = Integer.MAX_VALUE;
		int minind = -7;
		for (int i = 0; i < s.length; i++) {
			if (minval > s[i] && s[i] > 0) {
				minval = s[i];
				minind = i;
			}
		}
		return minind;
	}
}
