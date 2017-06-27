import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RangeEncoding {
	
	public int minRanges(int[] arr) {
		int rangeCount = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] - 1) {
				continue;
			}
			rangeCount++;
		}
		return rangeCount;
	}
}
