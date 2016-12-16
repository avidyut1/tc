import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BichromeBoard {
	
	public String ableToDraw(String[] board) {
		boolean ans = true;
        char s[][] = new char[board.length][board[0].length()];
        for (int i = 0; i < board.length; i++) {
            s[i] = board[i].toCharArray();
        }
        char grid[][] = new char[board.length][board[0].length()];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				if ((i + j) % 2 == 0) {
					grid[i][j] = 'B';
				}
				else {
                    grid[i][j] = 'W';
                }
            }
		}
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                if (s[i][j] == '?')
                    continue;;
                if (s[i][j] != grid[i][j]) {
                    ans = false;
                }
            }
        }
        char greverse[][] = new char[board.length][board[0].length()];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                if (grid[i][j] == 'W') {
                    greverse[i][j] = 'B';
                }
                else{
                    greverse[i][j] = 'W';
                }
            }
        }
        boolean ans1 = true;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (s[i][j] == '?')
                    continue;;
                if (s[i][j] != greverse[i][j]) {
                    ans1 = false;
                }
            }
        }
        if (ans || ans1) {
            return "Possible";
        }
        return "Impossible";
	}
}
