import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ProblemSetsEasy {
	
	public int maxSets(int E, int EM, int M, int MH, int H) {
		int ans = 0;
        while(true) {
			if (E > 0) {
				E--;
			}
			else if (EM > 0) {
				EM--;
			}
			else{
				break;
			}
			if (M > 0) {
				M--;
			}
			else if(EM > 0 || MH > 0) {
                if (EM >= MH) {
					EM--;
				}
				else{
					MH--;
				}
			}
			else{
				break;
			}
			if (H > 0) {
				H--;
			}
			else if (MH > 0) {
				MH--;
			}
			else{
				break;
			}
			ans++;
		}
		return ans;
	}
}
