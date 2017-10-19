import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class HillClimber {
	
	public int longest(int[] height) {
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			int j = i;
			for (; j < height.length - 1; j++) {
				if (height[j] >= height[j + 1]) {
					break;
				}
			}
			max = Math.max(j - i, max);
			i = j;

		}
		return max;
	}
}
