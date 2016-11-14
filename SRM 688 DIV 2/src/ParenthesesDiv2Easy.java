import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Easy {
	
	public int getDepth(String s) {
		Stack<Character> st = new Stack<Character>();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push('C');
			}
			else{
				ans = Math.max(ans, st.size());
				st.pop();
			}
		}
		return ans;
	}
}
