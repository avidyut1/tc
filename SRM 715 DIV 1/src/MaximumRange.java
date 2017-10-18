import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MaximumRange {
	
	public int findMax(String s) {
		int countPos = 0;
		int countNeg = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') {
				countPos++;
			}
			else
				countNeg++;
		}
		int max = Math.max(countNeg, countPos);
		return max;
	}
}
