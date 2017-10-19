import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LongLiveZhangzj {
	
	public int donate(String[] speech, String[] words) {
		int ans = 0;
		Arrays.sort(words);
		for (int i = 0; i < speech.length; i++) {
			if (Arrays.binarySearch(words, speech[i]) >= 0) {
				ans++;
			}
		}
		return ans;
	}
}
