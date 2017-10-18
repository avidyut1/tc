import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearPair {
	
	public int bigDistance(String s) {
		int ans = -1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j >= i; j--) {
				if(s.charAt(i) != s.charAt(j)) {
					ans = Math.max(ans, j - i);
				}
			}
		}
		return ans;
	}
}
