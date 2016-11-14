import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Medium {
	
	public int[] correct(String s) {
		Vector<Integer> ans = new Vector<Integer>();
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != '(') {
				ans.add(i);
			}
		}
		for (int i = s.length() / 2; i < s.length() ; i++) {
			if (s.charAt(i) != ')') {
				ans.add(i);
			}
		}
		int res[] = new int[ans.size()];
		int i = 0;
		for (int val: ans) {
			res[i++] = val;
		}
		return res;
	}
}
