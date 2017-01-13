import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ForgetfulAddition {
	
	public int minNumber(String expression) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= expression.length() - 1; i++) {
			String f = expression.substring(0, i);
			String s = expression.substring(i);
			if (f.equals("") || s.equals("")) {
				continue;
			}
			min = Math.min(min, Integer.parseInt(f) + Integer.parseInt(s));
		}
		return min;
	}
}
