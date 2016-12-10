import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class EightRooks {
	
	public String isCorrect(String[] board) {
		int row[] = new int[8];
		int col[] = new int[8];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				if (board[i].charAt(j) == 'R') {
					row[i]++;
					col[j]++;
				}
			}
		}
		int onear[] = new int[8];
		Arrays.fill(onear, 1);
		if (Arrays.equals(onear, row) && Arrays.equals(onear, col)) {
			return "Correct";
		}
		return "Incorrect";
	}
}
