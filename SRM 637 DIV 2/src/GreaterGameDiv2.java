import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GreaterGameDiv2 {
	
	public int calc(int[] snuke, int[] sothe) {
		int ans = 0;
		for (int i = 0; i < snuke.length; i++) {
			if (snuke[i] > sothe[i]) {
				ans++;
			}
		}
		return ans;
	}
}
