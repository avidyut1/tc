import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TriangleMaking {
	
	public int maxPerimeter(int a, int b, int c) {
		int ar[] = new int[]{a, b, c};
		Arrays.sort(ar);
		if (ar[0] == ar[2]) {
			return 3 * ar[0];
		}
		if (ar[0] + ar[1] <= ar[2]) {
			ar[2] = (ar[0] + ar[1]) - 1;
		}
		return ar[0] + ar[1] + ar[2];
	}
}
