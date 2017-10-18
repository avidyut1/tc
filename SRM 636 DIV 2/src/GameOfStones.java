import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GameOfStones {
	
	public int count(int[] stones) {
		int total = 0;
		for (int i = 0; i < stones.length; i++) {
			total += stones[i];
		}
		if (total % stones.length == 0) {
			int each = total / stones.length;
			int ans = 0;
			for (int i = 0; i < stones.length; i++) {
				int diff = Math.abs(each - stones[i]);
				if (diff % 2 == 0) {
					ans += diff / 2;
				}
				else{
					return -1;
				}
			}
			return ans / 2;
		}
		else {
			return -1;
		}
	}
}
