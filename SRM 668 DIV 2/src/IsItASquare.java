import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class IsItASquare {
	
	public String isSquare(int[] x, int[] y) {
		int n = x.length;
		double eps = (double)1e-9;
		Map<Double, Integer> count = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				int xr[] = new int[2];
				int yr[] = new int[2];
				xr[0] = x[i];
				xr[1] = x[j];
				yr[0] = y[i];
				yr[1] = y[j];
				double d = distance(xr, yr);
				count.put(d, count.containsKey(d) ? count.get(d) + 1 : 1);
			}
		}
		Set<Double> keys = count.keySet();
		System.out.println(count);
		boolean ans = false;
		for(Double k: keys) {
			if (count.get(k) == 8) {
				for(Double k2: keys) {
					if (k2 == k)
						continue;
					double diagonal = Math.sqrt(2) * k;
                    if (diagonal - k2 <= eps) {
						if (count.get(k2) == 4) {
							ans = true;
							break;
						}
					}
				}
			}
		}
		if (ans)
			return "It's a square";
		return "Not a square";
	}
	public double distance(int x[], int y[]) {
		return Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2));
	}
}
