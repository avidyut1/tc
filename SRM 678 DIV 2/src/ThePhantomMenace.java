import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ThePhantomMenace {
	
	public int find(int[] doors, int[] droids) {
		int safty = Integer.MIN_VALUE;
		for (int i = 0; i < doors.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < droids.length; j++) {
				min = Math.min(min, Math.abs(doors[i] - droids[j]));
			}
			safty = Math.max(min, safty);
		}
		return safty;
	}
}
