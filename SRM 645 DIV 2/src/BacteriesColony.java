import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BacteriesColony {
	
	public int[] performTheExperiment(int[] colonies) {
		int n = colonies.length;
		while(true) {
			Vector<Integer> increase = new Vector<>();
			Vector<Integer> decrease = new Vector<>();
			for (int i = 0; i < n; i++) {
				if (i + 1 < n && i - 1 >= 0) {
					if (colonies[i] < colonies[i + 1] && colonies[i] < colonies[i - 1]) {
						increase.add(i);
					}
					if (colonies[i] > colonies[i + 1] && colonies[i] > colonies[i - 1]) {
						decrease.add(i);
					}
				}
			}
			if (increase.isEmpty() && decrease.isEmpty()) {
				break;
			}
			for (int ind: increase) {
				colonies[ind]++;
			}
			for (int ind: decrease) {
				colonies[ind]--;
			}
		}
		return colonies;
	}
}
