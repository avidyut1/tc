import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ConnectedComponentConstruction {
	
	public String[] construct(int[] s) {
		int n = s.length;
		char solution[][] = new char[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(solution[i], 'N');
		}
		Vector<Integer> cc[] = new Vector[51];
		for (int i = 0; i < cc.length; i++) {
			cc[i] = new Vector<>();
		}
		for (int i = 0; i < n; i++) {
			cc[s[i]].add(i);
		}
		for (int i = 1; i < cc.length; i++) {
			if (cc[i].size() % i != 0){
				return new String[]{};
			}
		}
		for (int i = 0; i < cc.length; i++) {
			Vector<Integer> cci = cc[i];
			for (int j = 0; j < cci.size(); j++) {
                int k = j + 1;
				for (; k < Math.min(cci.size(), j + i); k++) {
					solution[cci.get(j)][cci.get(k)] = 'Y';
					solution[cci.get(k)][cci.get(j)] = 'Y';
				}
				j = k - 1;
			}
		}
		String res[] = new String[n];
		for (int i = 0; i < n; i++) {
			res[i] = new String(solution[i]);
			System.out.println(res[i]);
		}
		return res;
	}
}
