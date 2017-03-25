import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SafeBetting {
	
	public int minRounds(int a, int b, int c) {
		int ans = 0;
		while(b < c) {
			for (int x = b; x >= 0; x--) {
				if (b - x >= a) {
					b += x;
					ans++;
					break;
				}
			}
		}
		return ans;
	}
}
