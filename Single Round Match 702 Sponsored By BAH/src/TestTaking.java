import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TestTaking {
	
	public int findMax(int questions, int guessed, int actual) {
		int at = actual;
		int af = questions - at;
		int sf = questions - guessed;
		int ans = 0;
		if (guessed > at) {
			ans = at;
			ans += Math.min(sf, af);
		}
		else {
			ans = guessed;
			ans += Math.min(sf, af);
		}
		return ans;
	}
}
