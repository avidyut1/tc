import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NonDeterministicSubstring {
	
	public long ways(String A, String B) {
		int len = B.length();
		Set<String> hs = new HashSet<String>();
		for (int i = 0; i < A.length(); i++) {
			int j = i + len - 1;
			if (j < A.length()) {
				String C = A.substring(i, j + 1);
				if (matches(C, B)) {
					hs.add(C);
				}
			}
		}
		return hs.size();
	}
	public boolean matches(String c, String b) {
		boolean match = true;
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == b.charAt(i)) {
				continue;
			}
			if (b.charAt(i) == '?'){
				continue;
			}
			match = false;
			break;
		}
		return match;
	}
}
