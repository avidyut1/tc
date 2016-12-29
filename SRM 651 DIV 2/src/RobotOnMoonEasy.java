import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RobotOnMoonEasy {
	
	public String isSafeCommand(String[] board, String S) {
		int n = board.length;
        int m = board[0].length();
		char b[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			b[i] = board[i].toCharArray();
		}
		int x = -7, y = -7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (b[i][j] == 'S') {
					x = i;
					y = j;
					b[i][j] = '.';
					break;
				}
			}
		}
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'U') {
				if (x - 1 >= 0) {
					if (b[x - 1][y] == '.') {
						x--;
					}
				}
				else{
					return "Dead";
				}
			}
			else if (S.charAt(i) == 'D') {
				if (x + 1 < n) {
					if (b[x + 1][y] == '.') {
						x++;
					}
				}
				else{
					return "Dead";
				}
			}
			else if (S.charAt(i) == 'L') {
				if (y - 1 >= 0) {
					if (b[x][y - 1] == '.') {
						y--;
					}
				}
				else{
					return "Dead";
				}
			}
			else if (S.charAt(i) == 'R') {
				if (y + 1 < m) {
					if (b[x][y + 1] == '.') {
						y++;
					}
				}
				else{
					return "Dead";
				}
			}
		}
		return "Alive";
	}
}
