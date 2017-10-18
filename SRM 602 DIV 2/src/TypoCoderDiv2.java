import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TypoCoderDiv2 {
	
	public int count(int[] rating) {
		boolean color = false;
		int ans = 0;
		for (int i = 0; i < rating.length; i++) {
			if(rating[i] >= 1200 && !color) {
				color = true;
				ans++;
			}
			else if(rating[i] < 1200 && color) {
				color = false;ans++;
			}
		}
		return ans;
	}
}
