import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SortishDiv2 {
	int numways = 0;
	Set<String> hs = new HashSet<>();
	public int ways(int sortedness, int[] seq) {
		Vector<Integer> missingnums = new Vector<>();
		for (int i = 0; i < seq.length; i++) {
			missingnums.add(i + 1);
		}
		for (int i = 0; i < seq.length; i++) {
			missingnums.remove(new Integer(seq[i]));
		}
		recurse(sortedness, seq, missingnums);
		return numways;
	}
	public boolean hasZero(int s[]) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 0)
				return true;
		}
		return false;
	}
	public boolean hasAll(int s[]) {
		int ns[] = new int[s.length];
		System.arraycopy(s, 0, ns, 0, s.length);
		Arrays.sort(ns);
		for (int i = 1; i <= s.length; i++) {
			if (Arrays.binarySearch(ns, i) >= 0) {
				continue;
			}
			return false;
		}
		return true;
	}
	public void recurse(int sd, int sq[], Vector<Integer> mn) {
		if (!hasZero(sq) && hasAll(sq)) {
			int ans = 0;
			for (int i = 0; i < sq.length; i++) {
				for (int j = i + 1; j < sq.length; j++) {
					if (sq[j] > sq[i]) {
						ans++;
					}
				}
			}
			if (ans == sd) {
				String res = "";
				for (int i = 0; i < sq.length; i++) {
					res += sq[i] + " ";
				}
				if (hs.contains(res)) {
					return;
				}
				hs.add(res);
				numways++;
			}
			return;
		}
		for (int i = 0; i < sq.length; i++) {
			if (sq[i] == 0) {
				for (int j = 0; j < mn.size(); j++) {
					int nsq[] = new int[sq.length];
					System.arraycopy(sq, 0, nsq, 0, sq.length);
					nsq[i] = mn.get(j);
					recurse(sd, nsq, mn);
				}
			}
		}
	}
}
