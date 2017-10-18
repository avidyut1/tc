import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MountainRanges {
	
	public int countPeaks(int[] heights) {
		int ans = 0;
		if (heights.length == 1) {
			return 1;
		}
		for (int i = 0; i < heights.length; i++) {
            if (i == 0 && i + 1 < heights.length && heights[i] > heights[i + 1]) {
				ans++;
			}
			else if(i == heights.length - 1 && i - 1 >= 0 && heights[i] > heights[i - 1]) {
				ans++;
			}
			else if (i >= 1 && i <= heights.length - 1){
				if (heights[i - 1] < heights[i] && heights[i] > heights[i + 1]) {
					ans++;
				}
			}
		}
		return ans;
	}
}
