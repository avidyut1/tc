import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class EqualSubstrings2 {
	
	public int get(String s) {
		int n = s.length();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				String subs = s.substring(i, j + 1);
				for (int k = j + 1; k < n; k++) {
					for (int l = k; l < n; l++) {
						String subf = s.substring(k ,l + 1);
						if (subf.equals(subs)) {
							ans++;
						}
					}
				}
			}
		}
		return ans;
	}
}
