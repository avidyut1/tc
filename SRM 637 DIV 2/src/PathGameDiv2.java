import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PathGameDiv2 {
	int min = Integer.MAX_VALUE;
	public int calc(String[] board) {
		boolean v[][] = new boolean[board.length][board[0].length()];
		dfs(board, 0, 0, 1, v);
		for (int i = 0; i < v.length; i++) {
            Arrays.fill(v[i], false);
		}
		dfs(board, 1, 0, 1, v);
		int total = board.length * board[0].length();
		int black = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length(); j++) {
				black += board[i].charAt(j) == '#' ? 1 : 0;
			}
		}
		return total - min - black;
	}
	public void dfs(String b[], int r, int c, int ans, boolean v[][]) {
		if (b[r].charAt(c) == '#') {
			return;
		}
		if (c == b[0].length() - 1) {
			min = Math.min(min, ans);
			return;
		}
		v[r][c] = true;
		if (b[r].charAt(c + 1) == '.' && !v[r][c + 1]) {
			dfs(b, r, c + 1, ans + 1, v);
		}
		if (r - 1 >= 0 && b[r - 1].charAt(c) == '.' && !v[r - 1][c]) {
			dfs(b, r - 1, c, ans + 1, v);
		}
		if (r + 1 < b.length && b[r + 1].charAt(c) == '.' && !v[r + 1][c]) {
			dfs(b, r + 1, c, ans + 1, v);
		}
	}
}
