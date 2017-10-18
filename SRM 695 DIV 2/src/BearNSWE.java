import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearNSWE {
	
	public double totalDistance(int[] a, String dir) {
		double ans = 0d;
		int xc = 0, yc = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
			if(dir.charAt(i) == 'N'){
				yc += a[i];
			}
			else if (dir.charAt(i) == 'S') {
				yc -= a[i];
			}
			else if (dir.charAt(i) == 'E') {
				xc += a[i];
			}
			else {
				xc -= a[i];
			}
		}
		ans += Math.sqrt(Math.pow(xc, 2) + Math.pow(yc, 2));
		return ans;
	}
}
