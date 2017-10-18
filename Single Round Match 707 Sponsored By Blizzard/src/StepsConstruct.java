import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class StepsConstruct {
	
	public String construct(String[] board, int k) {
		Queue<Cell> q = new LinkedList<>();
		q.add(new Cell(0, 0, ""));
		boolean v[][] = new boolean[board.length][board[0].length()];
		String fres = "";
		while(!q.isEmpty()) {
			Cell c = q.poll();
            if (board[c.r].charAt(c.c) == '#') {
				continue;
			}
			if (c.r == board.length - 1 && c.c == board[0].length() - 1) {
				if (c.res.length() == k) {
					return c.res;
				}
				else {
					fres = c.res;
					break;
				}
			}
			v[c.r][c.c] = true;
            if (c.r - 1 >= 0 && !v[c.r - 1][c.c] && board[c.r - 1].charAt(c.c) == '.') {
				q.add(new Cell(c.r - 1, c.c, c.res + 'U'));
			}
			if (c.r + 1 < board.length && !v[c.r + 1][c.c] && board[c.r + 1].charAt(c.c) == '.') {
				q.add(new Cell(c.r + 1, c.c, c.res + 'D'));
			}
			if (c.c - 1 >= 0 && !v[c.r][c.c - 1] && board[c.r].charAt(c.c - 1) == '.') {
				q.add(new Cell(c.r, c.c - 1, c.res + 'L'));
			}
			if (c.c + 1 < board[0].length() && !v[c.r][c.c + 1] && board[c.r].charAt(c.c + 1) == '.') {
				q.add(new Cell(c.r, c.c + 1, c.res + 'R'));
			}
		}
		if (fres.length() > 0 && k > fres.length()) {
            int rem = k - fres.length();
			if (rem % 2 == 0) {
				while(rem > 0) {
					String frescopy = fres;
					if (frescopy.charAt(frescopy.length() - 1) == 'U') {
						fres += 'D';
					}
					else if (frescopy.charAt(frescopy.length() - 1) == 'D') {
						fres += 'U';
					}
					else if (frescopy.charAt(frescopy.length() - 1) == 'L') {
						fres += 'R';
					}
					else {
						fres += 'L';
					}
					frescopy = fres;
					if (frescopy.charAt(frescopy.length() - 1) == 'U') {
						fres += 'D';
					}
					else if (frescopy.charAt(frescopy.length() - 1) == 'D') {
						fres += 'U';
					}
					else if (frescopy.charAt(frescopy.length() - 1) == 'L') {
						fres += 'R';
					}
					else {
						fres += 'L';
					}
					rem-=2;
				}
				return fres;
			}
		}
		return "";
	}
}
class Cell{
	int r, c; String res;
	public Cell(int r, int c, String res) {
		this.r = r;
		this.c = c;
		this.res = res;
	}
}
