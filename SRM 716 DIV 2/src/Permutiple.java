import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Permutiple {
	
	public String isPossible(int x) {
		for (int i = 2; i <= 10; i++) {
			int res = x * i;
			if (check(res, x)) {
				return "Possible";
			}
		}
		return "Impossible";
	}
	private boolean check(int a, int b) {
		String as = Integer.toString(a);
		String bs = Integer.toString(b);
		if (as.length() != bs.length()) {
			return false;
		}
        List<Character> lsa = new ArrayList<>();
		for (int i = 0; i < as.length(); i++) {
			lsa.add(as.charAt(i));
		}
		List<Character> lsb = new ArrayList<>();
		for (int i = 0; i < bs.length(); i++) {
			lsb.add(bs.charAt(i));
		}
		Collections.sort(lsa);
		Collections.sort(lsb);
		for (int i = 0; i < lsa.size(); i++) {
			if (lsa.get(i) != lsb.get(i)) {
				return false;
			}
		}
		return true;
	}
}
