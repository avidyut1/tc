import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FallingSand {
	
	public String[] simulate(String[] board) {
		int n = board.length;
		int m = board[0].length();
		char b[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			b[i] = board[i].toCharArray();
		}
		for (int i = 0; i < m; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (b[j][i] == 'o') {
					int indb = findRow(b, i, j);
					b[j][i] = '.';
					b[indb][i] = 'o';
				}
			}
		}
		String []res = new String[n];
		for (int i = 0; i < b.length; i++) {
			res[i] = new String(b[i]);
		}
		return res;
	}
	public int findRow(char b[][], int j, int i) {
		for (int k = i + 1; k < b.length; k++) {
			if (b[k][j] != '.') {
				return k - 1;
			}
		}
		return b.length - 1;
	}
}
