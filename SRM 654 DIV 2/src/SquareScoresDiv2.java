import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SquareScoresDiv2 {
	
	public int getscore(String s) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int len = 1; len <= s.length(); len++) {
			for (int i = 0; i < s.length(); i++) {
				int j = i + len;
				if (j <= s.length()) {
					String sub = s.substring(i, j);
                    if (allSame(sub)) {
						if (hm.containsKey(sub)) {
							hm.put(sub, hm.get(sub) + 1);
						}
						else {
							hm.put(sub, 1);
						}
					}
				}
			}
		}
		Set<String> keys = hm.keySet();
		int ans = 0;
		for (String k: keys) {
			ans += hm.get(k);
		}
		return ans;
	}
	public boolean allSame(String s) {
		char c[] = s.toCharArray();
		char fc = c[0];
		for (int i = 0; i < c.length; i++) {
			if (fc != c[i]) {
				return false;
			}
		}
		return true;
	}
}
