import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MagicSubset {
	
	public int findBest(int[] values) {
        int sumpos = 0, sumneg = 0;
		for (int i = 1; i < values.length; i++) {
			if (values[i] > 0) {
				sumpos += values[i];
			}
			else {
				sumneg += values[i];
			}
		}
		sumneg = -1 * (sumneg + values[0]);
		return Math.max(sumneg, Math.max(sumpos, 0));
	}
}
