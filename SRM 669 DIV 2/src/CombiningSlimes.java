import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CombiningSlimes {
	
	public int maxMascots(int[] a) {
		Arrays.sort(a);
		int n = a.length;
        Queue<Integer> max = new PriorityQueue<>(10000, Collections.reverseOrder());
		Queue<Integer> min = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			max.add(a[i]);
			min.add(a[i]);
		}
		int ans = 0;
		while(true) {
			int maxe = max.poll();
			int mine = min.poll();
			max.remove(mine);
			min.remove(maxe);
			ans += maxe * mine;
            if (max.isEmpty() && min.isEmpty())
            	break;
			max.add(maxe + mine);
			min.add(maxe + mine);
		}
		return ans;
	}
}
