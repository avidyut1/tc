import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PeacefulLine {
	
	public String makeLine(int[] x) {
		Arrays.sort(x);
		int n = x.length;
        int freq[] = new int[26];
		for (int i = 0; i < n; i++) {
			freq[x[i]]++;
		}
		int val = n % 2 == 0 ? n / 2 : n / 2 + 1;
		for (int i = 0; i < 26; i++) {
			if (freq[i] > val) {
				return "impossible";
			}
		}
		return "possible";
	}
}
