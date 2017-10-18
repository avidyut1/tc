import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TrianglesContainOriginEasy {
	
	public int count(int[] x, int[] y) {
		int ans = 0;
		int n = x.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					double ab = distance(x[i], y[i], x[j], y[j]);
					double ac = distance(x[i], y[i], x[k], y[k]);
					double bc = distance(x[j], y[j], x[k], y[k]);
					if (ab + ac > bc && ab + bc > ac && bc + ac > ab) {
						int xsel[] = new int[3];
						int ysel[] = new int[3];
                        xsel[0] = x[i];
						xsel[1] = x[j];
						xsel[2] = x[k];
						ysel[0] = y[i];
						ysel[1] = y[j];
						ysel[2] = y[k];
						double totalArea = area(xsel, ysel);
						double sumArea = 0;
						for (int l = 0; l < 3; l++) {
							int xnew[] = new int[3];
							int ynew[] = new int[3];
							System.arraycopy(xsel, 0, xnew, 0, 3);
							System.arraycopy(ysel, 0, ynew, 0, 3);
							xnew[l] = 0;
							ynew[l] = 0;
							sumArea += area(xnew, ynew);
						}
						if (Math.abs(sumArea - totalArea) <= 1e-9) {
							ans++;
						}
					}
				}
			}
		}
		return ans;
	}
	public double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	public double area(int x[], int y[]) {
		return Math.abs((x[0] * (y[1] - y[2]) + (x[1] * (y[2] - y[0])) + (x[2] * (y[0] - y[1]))) / 2.0);
	}
}

