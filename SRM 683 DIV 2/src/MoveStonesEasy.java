import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MoveStonesEasy {
	
	public int get(int[] a, int[] b) {
		int n = a.length;
		int steps = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) {
				continue;
			}
			if (a[i] > b[i]) {
				int diff = a[i] - b[i];
				steps += diff;
				a[i] -= diff;
				if (i + 1 < n) {
					a[i + 1] += diff;
				}
				else
					return -1;
			}
			else {
				//ai < bi
				int diff = b[i] - a[i];
				a[i] += diff;
				steps += diff;
				if (i + 1 < n)
					a[i + 1] -= diff;
				else
					return -1;
			}
		}
		for (int i = 0; i < n; i++) {
			if (a[i] != b[i]){
				return -1;
			}
		}
		return steps;
	}
}
