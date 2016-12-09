import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FilipTheFrog {
	
	public int countReachableIslands(int[] positions, int L) {
		int startisland = positions[0];
		Arrays.sort(positions);
        int ind = Arrays.binarySearch(positions, startisland);
		int ans = 1;
		for (int i = ind + 1; i < positions.length; i++) {
			if (positions[i] - positions[i - 1] <= L) {
				ans++;
			}
			else
				break;
		}
		for (int i = ind; i > 0; i--) {
			if (positions[i] - positions[i - 1] <= L) {
				ans++;
			}
			else{
				break;
			}
		}
		return ans;
	}
}
