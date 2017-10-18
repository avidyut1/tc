import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LiveConcert {
	
	public int maxHappiness(int[] h, String[] s){
		Map<String, Integer> hm = new HashMap<String, Integer>();
		int n = h.length;
		for (int i = 0; i < n; i++) {
			if (hm.containsKey(s[i])) {
				int val = hm.get(s[i]);
				if (val < h[i]) {
					hm.put(s[i], h[i]);
				}
			}
			else {
				hm.put(s[i], h[i]);
			}
		}
		Set<String> keys = hm.keySet();
		int ans = 0;
		for(String k: keys) {
			ans += hm.get(k);
		}
		return ans;
	}
}
