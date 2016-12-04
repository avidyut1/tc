import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ChessFloor {
	
	public int minimumChanges(String[] floor) {
		int res = Integer.MAX_VALUE;
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < alpha.length(); i++) {
			for (int j = 0; j < alpha.length(); j++) {
				if (i == j)
					continue;
				char c1 = alpha.charAt(i);
				char c2 = alpha.charAt(j);
				boolean c = true;
				int ans = 0;
				for (int k = 0; k < floor.length; k++) {
                    if (k % 2 == 0) {
						c = false;
					}
					else
						c = true;
					for (int l = 0; l < floor[k].length(); l++) {
                        if (c) {
                            if (floor[k].charAt(l) != c1) {
                                ans++;
                            }
                        }
                        else {
                            if (floor[k].charAt(l) != c2) {
                                ans++;
                            }
                        }
						c = !c;
					}
				}
				res = Math.min(res, ans);
			}
		}
		return res;
	}
}
