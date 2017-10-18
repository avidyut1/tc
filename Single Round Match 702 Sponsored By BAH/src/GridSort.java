import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GridSort {
	
	public String sort(int n, int m, int[] grid) {
		int initialgrid[][] = new int[n][m];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				initialgrid[i][j] = ++count;
			}
		}
		int givengrid[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				givengrid[i][j] = grid[i * m + j];
			}
		}
		boolean ans = true;
		for (int i = 0; i < n; i++) {
			if(!findRow(i, initialgrid, givengrid)) {
				ans = false;
			}
		}
		for (int i = 0; i < m; i++) {
			if(!findCol(i, initialgrid, givengrid)) {
				ans = false;
			}
		}
		if (ans)
			return "Possible";
		return "Impossible";
	}
	public boolean findRow(int i, int ig[][], int gg[][]) {
		int n = ig.length;
		int m = ig[0].length;
		boolean ans = false;
		Vector<Integer> cole = new Vector<Integer>();
		for (int j = 0; j < m; j++) {
			cole.add(ig[i][j]);
		}
		Vector<Vector<Integer>> vec = new Vector<Vector<Integer>>();
		for (int j = 0; j < n; j++) {
			vec.add(new Vector<Integer>());
			for (int k = 0; k < m; k++) {
				vec.get(vec.size() - 1).add(gg[j][k]);
			}
		}
		for (Vector<Integer> v : vec) {
			Collections.sort(v);
			if (v.equals(cole)) {
				return true;
			}
		}
		return false;
	}
	public boolean findCol(int i, int ig[][], int gg[][]) {
		int n = ig.length;
		int m = ig[0].length;
		boolean ans = false;
		Vector<Integer> cole = new Vector<Integer>();
		for (int j = 0; j < n; j++) {
            cole.add(ig[j][i]);
		}
		Vector<Vector<Integer>> vec = new Vector<Vector<Integer>>();
		for (int j = 0; j < m; j++) {
			vec.add(new Vector<Integer>());
			for (int k = 0; k < n; k++) {
				vec.get(vec.size() - 1).add(gg[k][j]);
			}
		}
		for (Vector<Integer> v : vec) {
			Collections.sort(v);
			if (v.equals(cole)) {
				return true;
			}
		}
		return false;
	}
}
