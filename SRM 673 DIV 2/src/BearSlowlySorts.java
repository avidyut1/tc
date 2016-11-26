import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearSlowlySorts {
	
	public int minMoves(int[] w) {
		int move = 3;
		int n = w.length;
		int war[] = new int[w.length];
		System.arraycopy(w, 0, war, 0, w.length);
		Arrays.sort(war);
		if (Arrays.equals(war, w)) {
			move = 0;
		}
		else if(war[0] == w[0] || war[n - 1] == w[n - 1]){
			move = 1;
		}
		else {
			int test[] = new int[n];
			System.arraycopy(w, 0, test, 0, n);
			Arrays.sort(test,  0, n - 1);
			Arrays.sort(test, 1, n);
			if (Arrays.equals(test, war)) {
				move = 2;
			}
			else {
				test = new int[n];
				System.arraycopy(w, 0, test, 0, n);
				Arrays.sort(test, 1, n);
				Arrays.sort(test,  0, n - 1);
				if (Arrays.equals(test, war)) {
					move = 2;
				}
			}
		}
		return move;
	}
}
