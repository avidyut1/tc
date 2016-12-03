import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PointDistance {
	
	public int[] findPoint(int x1, int y1, int x2, int y2) {
		for (int x = -100; x <= 100; x++) {
			for (int y = -100; y < 100; y++) {
				if ((x == x1 && y == y1) || (x == x2 && y == y2)) {
					continue;
				}
				if (dist(x1, y1, x, y) > dist(x2, y2, x, y)) {
					return new int[]{x, y};
				}
			}
		}
		return null;
	}
	public double dist(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1- y2, 2));
	}
}
