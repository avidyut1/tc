import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ExplodingRobots {
	
	public String canExplode(int x1, int y1, int x2, int y2, String instructions) {
		int maxl = 0, maxr = 0, maxu = 0, maxd = 0;
		for (int i = 0; i < instructions.length(); i++) {
			if (instructions.charAt(i) == 'L') {
				maxl++;
			}
			if (instructions.charAt(i) == 'R') {
				maxr++;
			}
			if (instructions.charAt(i) == 'U') {
				maxu++;
			}
			if (instructions.charAt(i) == 'D') {
				maxd++;
			}
		}
		//trying for meeting x
		boolean meetx = false;
		boolean meety = false;
		if (x1 == x2)
			meetx = true;
		if (y1 == y2)
			meety = true;
		if (Math.abs(x1 - x2) <= maxl + maxr) {
			meetx = true;
		}
		if (Math.abs(y1 - y2) <= maxu + maxd) {
			meety = true;
		}
		if (meetx && meety){
			return "Explosion";
		}
		return "Safe";
	}
}
