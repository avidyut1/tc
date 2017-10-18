import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SuperUserDo {
	
	public int install(int[] A, int[] B) {
		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			for (int j = A[i]; j <= B[i]; j++) {
				hs.add(j);
			}
		}
		return hs.size();
	}
}
