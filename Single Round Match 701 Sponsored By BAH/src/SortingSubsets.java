import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SortingSubsets {
	
	public int getMinimalSize(int[] a) {
		int len = a.length;
		int sorted[] = new int[len];
		for (int i = 0; i < len; i++) {
			sorted[i] = a[i];
		}
		Arrays.sort(sorted);
		int numposition = 0;
		for (int i = 0; i < len; i++) {
			if (sorted[i] != a[i])
				numposition++;
		}
		return numposition;
	}
}
