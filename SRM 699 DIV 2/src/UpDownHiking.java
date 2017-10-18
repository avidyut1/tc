import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class UpDownHiking {
	
	public int maxHeight(int N, int A, int B) {
        int ans = 0;
        for (int i = 1; i < N * A; i++) {
            int day = (i / A) + (i % A == 0 ? 0 : 1);
            int dayrem = N - day;
            if(dayrem * B >= i) {
                ans = i;
            }
        }
        return ans;
	}
}
