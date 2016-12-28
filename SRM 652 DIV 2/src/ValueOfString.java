import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ValueOfString {
	
	public int findValue(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			int ki = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) <= s.charAt(i)) {
					ki++;
				}
			}
			ans += ki * ((int)s.charAt(i) - 96);
		}
		return ans;
	}
}
