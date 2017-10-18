import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SegmentsAndPoints {
	
	public String isPossible(int[] p, int[] l, int[] r) {
		int n = l.length;
        Arrays.sort(p);
        boolean assigned[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            Vector<Index> possible = new Vector<Index>();
            for (int j = 0; j < n; j++) {
                if(assigned[j]){
                    continue;
                }
                if (l[j] <= p[i] && r[j] >= p[i]) {
                    possible.add(new Index(j, r[j]));
                }
            }
            if (possible.isEmpty()) {
                return "Impossible";
            }
            Collections.sort(possible);
            int ind = possible.get(0).i;
            assigned[ind] = true;
        }
        return "Possible";
	}
}
class Index implements Comparable<Index>{
    int i, r;
    public Index(int i, int r) {
        this.i = i;
        this.r = r;
    }
    @Override
    public int compareTo(Index that) {
        return this.r - that.r;
    }
}