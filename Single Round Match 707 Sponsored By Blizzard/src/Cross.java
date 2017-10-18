import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Cross {
	
	public String exist(String[] board) {
		int n = board.length;
		int m = board[0].length();
		char b[][] = new char[board.length][board[0].length()];
		for (int i = 0; i < board.length; i++) {
			b[i] = board[i].toCharArray();
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				if (b[i][j] == '#' && i - 1 >= 0 && b[i - 1][j] == '#' && i + 1 < n && b[i + 1][j] == '#' && j - 1 >= 0 && b[i][j - 1] == '#' && j + 1 < m && b[i][j + 1] == '#') {
					return "Exist";
				}
			}
		}
		return "Does not exist";
	}
}
