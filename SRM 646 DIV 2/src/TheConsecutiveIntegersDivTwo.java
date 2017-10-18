import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheConsecutiveIntegersDivTwo {
	
	public int find(int[] numbers, int k) {
		if (k == 1)
			return 0;
		int ans = Integer.MAX_VALUE;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			ans = Math.min(ans, Math.abs(numbers[i + 1] - numbers[i] - 1));
		}
		return ans;
	}
}
