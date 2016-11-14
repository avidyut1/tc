import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PriorityQueue {
	
	public int findAnnoyance(String S, int[] a) {
		int ans = 0;
		Vector<Integer> queue = new Vector<Integer>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'b' && i != 0) {
				for(int st : queue) {
					ans += a[st];
				}
				queue.add(0, i);
			}
			else {
				queue.add(i);
			}
		}
		return ans;
	}
}
