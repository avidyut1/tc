import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoldingPaper2 {
	int INF = 1000000000;
	public int solve(int W, int H, int A) {
		int min = INF;
		for (int i = 1; i <= Math.sqrt(A); i++) {
			if (A % i == 0) {
				int w = A / i;
				int h = i;
                min = Math.min(min, fold(W, w) + fold(H, h));
                w = i;
				h = A / i;
				min = Math.min(min, fold(W, w) + fold(H, h));
			}
		}
		if (min >= INF) {
			return -1;
		}
		return min;
	}
	public int fold(int x, int y) {
		if (x == y) {
			return 0;
		}
		if (x < y) {
			return INF;
		}
		return 1 + fold(x - Math.min(x/2, x - y), y);
	}
}
