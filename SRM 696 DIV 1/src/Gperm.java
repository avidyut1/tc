import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Gperm {
	
	public int countfee(int[] x, int[] y) {
		Vector graph[] = new Vector[50];
		for (int i = 0; i < 50; i++) {
			graph[i] = new Vector<Integer>();
		}
		for (int i = 0; i < x.length; i++) {
			graph[x[i]].add(y[i]);
			graph[y[i]].add(x[i]);
		}

		return 0;
	}
}
