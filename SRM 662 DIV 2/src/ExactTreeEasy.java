import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ExactTreeEasy {
	
	public int[] getTree(int n, int m) {
        Vector<Integer> res = new Vector<>();
		for (int i = 0; i < n - m - 1; i++) {
            res.add(i);
			res.add(i + 1);
		}
		for (int i = 0; i < m; i++) {
            res.add(0);
			res.add(n - m + i);
		}
		int resar[] = new int[res.size()];
		for (int i = 0; i < res.size(); i++) {
			resar[i] = res.get(i);
		}
		return resar;
	}
}
