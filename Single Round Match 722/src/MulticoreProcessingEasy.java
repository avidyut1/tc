import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MulticoreProcessingEasy {
	
	public long fastestTime(int jobLength, int corePenalty, int[] speed, int[] cores) {
		double mintime = Double.MAX_VALUE;
		for (int i = 0; i < speed.length; i++) {
			double time = (double)jobLength / cores[i] / speed[i];
			time += (cores[i] - 1) * corePenalty;
			mintime = Math.min(mintime, time);
		}
		return (long)Math.ceil(mintime);
	}
}
