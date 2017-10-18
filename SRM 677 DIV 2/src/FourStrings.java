import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FourStrings {
	
	public int shortestLength(String a, String b, String c, String d) {
		int perm[] = new int[]{1234, 1243, 1324, 1342, 1423, 1432,
				2134, 2143, 2314, 2341, 2413, 2431,
				3214, 3241, 3124, 3142, 3421, 3412,
				4231, 4213, 4321, 4312, 4123, 4132};
		String ar[] = new String[]{a, b, c, d};
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < perm.length; i++) {
			String perms = Integer.toString(perm[i]);
			String supersar[] = new String[4];
			for (int j = 0; j < perms.length(); j++) {
				int ind = Integer.parseInt(Character.toString(perms.charAt(j))) - 1;
				supersar[j] = ar[ind];
			}
			String superstring = merge(merge(supersar[0], supersar[1]), merge(supersar[2], supersar[3]));
			ans = Math.min(ans, superstring.length());
		}
		return ans;
	}
	public String merge(String f, String s) {
		int ind1 = f.indexOf(s);
		if (ind1 >= 0) {
			return f;
		}
		int ind2 = s.indexOf(f);
		if (ind2 >= 0) {
			return s;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			String secf = s.substring(0, i + 1);
			int ind = f.lastIndexOf(secf);
			if (ind >= 0)
			if (ind + secf.length() == f.length()) {
				return f.substring(0, ind) + s;
			}
		}
		return f + s;
	}
}
