import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CoinFlipsDiv2 {
	
	public int countCoins(String state) {
		int ans = 0;
		for (int i = 0; i < state.length(); i++) {
			char c = state.charAt(i);
			if (i - 1 >= 0 && state.charAt(i - 1) != c) {
				ans++;
				continue;
			}
			if (i + 1 < state.length() && state.charAt(i + 1) != c) {
				ans++;
			}
		}
		return ans;
	}
}
