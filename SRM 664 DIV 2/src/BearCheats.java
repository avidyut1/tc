import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearCheats {
	
	public String eyesight(int A, int B) {
		int diffdig = 0;
		String As = A+"";
		String Bs = B+"";
		for (int i = 0; i < As.length(); i++) {
			if (As.charAt(i) != Bs.charAt(i)) {
				diffdig++;
			}
		}
		if (diffdig <= 1)
			return "happy";
		return "glasses";
	}

}
