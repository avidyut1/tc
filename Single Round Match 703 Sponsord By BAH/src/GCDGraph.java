import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GCDGraph {
	int f[] = new int[1000001];
	public String possible(int n, int k, int x, int y) {
        if (k == 0) {
			return "Possible";
		}
		for (int i = 1; i <= n; i++) {
			f[i] = i;
		}
		for (int i = k + 1; i <= n; i++) {
			for (int j = 2; j * i <= n; j++) {
				int faa = fa(i), fab = fa(i * j);
				f[faa] = fab;
			}
		}
		if (fa(x) == fa(y))
			return "Possible";
		return "Impossible";
	}
	public  int fa(int x) {
		if (x == f[x]) {
			return x;
		}
		else{
			f[x] = fa(f[x]);
			return f[x];
		}
	}
}
