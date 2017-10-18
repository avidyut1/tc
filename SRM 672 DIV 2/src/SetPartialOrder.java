import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SetPartialOrder {
	
	public String compareSets(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		boolean ainb = true;
		for (int i = 0; i < a.length; i++) {
			if (Arrays.binarySearch(b, a[i]) >= 0) {
				continue;
			}
			ainb = false;
		}
		boolean bina = true;
		for (int i = 0; i < b.length; i++) {
			if (Arrays.binarySearch(a, b[i]) >= 0) {
				continue;
			}
			bina = false;
		}
		if (ainb && bina) {
			return "EQUAL";
		}
		else if(ainb) {
			return "LESS";
		}
		else if(bina) {
			return "GREATER";
		}
		return "INCOMPARABLE";
	}
}
