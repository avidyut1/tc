import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Medium {
	
	public int[] correct(String s) {
		Vector<Integer> ans = new Vector<Integer>();
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				c++;
			}
			else {
				c--;
				if (c < 0) {
					c = 1;
					ans.add(i);
				}
			}
		}
		c = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == ')') {
				c++;
			}
			else {
				c--;
				if (c < 0) {
					c = 1;
					ans.add(i);
				}
			}
		}
		int ind = 0;
		int res[] = new int[ans.size()];
		for( int a : ans) {
			res[ind++] = a;
		}
		System.out.println(ans);
		return res;
	}
}
