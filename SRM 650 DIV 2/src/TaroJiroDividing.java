import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroJiroDividing {
	
	public int getNumber(int A, int B) {
		Set<Integer> hs = new HashSet<>();
        while(true) {
			hs.add(A);
			if (A % 2 != 0)
				break;
			A /= 2;
			if (A % 2 != 0) {
				hs.add(A);
				break;
			}
		}
		int count = 0;
		while(true) {
			if (hs.contains(B)) {
				count++;
			}
			if (B % 2 != 0) {
				break;
			}
			B /= 2;
			if (B % 2 != 0) {
				if (hs.contains(B)) {
					count++;
				}
				break;
			}
		}
		return count;
	}
}
