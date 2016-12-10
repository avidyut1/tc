import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BichromeBoard {
	
	public String ableToDraw(String[] board) {
		boolean ans = true;
        char s[][] = new char[board.length][board[0].length()];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				if (s[i][j] == '?') {
					//check for white feasible
					if (i - 1 >= 0 && s[i][j] == 'B') {
						s[i][j] = 'W';
					}
					else if (j - 1 >= 0 && s[i][j] == 'B') {
						s[i][j] = 'W';
					}
					if (i - 1 >= 0 && s[i][j] == 'W') {
						s[i][j] = 'B';
					}
					else if (j - 1 >= 0 && s[i][j] == 'W') {
						s[i][j] = 'B';
					}
					if (s[i][j] == '?'){
						return "Impossible";
					}
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {

			}
		}
		return "Possible";
	}
}
