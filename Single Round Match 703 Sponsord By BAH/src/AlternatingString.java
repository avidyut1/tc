import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AlternatingString {
	
	public int maxLength(String s) {
		char match1 = '0';
		char match2 = '1';
		int ans = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				int j = i + 1;
				boolean matchf = true;
				while(j < s.length()) {
					if (matchf) {
						if (s.charAt(j) == match2) {
							j++;
                            ans = Math.max(ans, j - i);
						}
						else
							break;
					}
					else {
						if (s.charAt(j) == match1) {
							j++;
							ans = Math.max(ans, j - i);
						}
						else
							break;
					}
					matchf = !matchf;
				}
			}
			else if(s.charAt(i) == '1') {
				int j = i + 1;
				boolean matchf = false;
				while(j < s.length()) {
					if (matchf) {
						if (s.charAt(j) == match2) {
							j++;
							ans = Math.max(ans, j - i);
						}
						else
							break;
					}
					else {
						if (s.charAt(j) == match1) {
							j++;
							ans = Math.max(ans, j - i);
						}
						else
							break;
					}
					matchf = !matchf;
				}
			}
		}
		return ans;
	}
}
