import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class StringTransform {
	
	public String isPossible(String s, String t) {
		char sar[] = s.toCharArray();
		char tar[] = t.toCharArray();
		int n = s.length();
		for (int i = n - 1; i >= 0; i--) {
			if (sar[i] == tar[i]) {
				continue;
			}
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (sar[j] == tar[i]) {
					sar[i] = sar[j];
					flag = true;
				}
			}
			if (!flag) {
				return "Impossible";
			}
		}
		return "Possible";
	}
}
