import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SymmetryDetection {
	
	public String detect(String[] board) {
		boolean verticallySymetric = true;
		boolean horizontallySymetric = true;
		int n = board.length;
		int m = board[0].length();
		int j = n - 1;
		for (int i = 0; i < n; i++) {
            if (i > j) {
				break;
			}
			if (!sameRow(i, j, board)) {
				horizontallySymetric = false;
				break;
			}
			j--;
		}
		j = m - 1;
		for (int i = 0; i < m; i++) {
			if (i > j) {
				break;
			}
			if (!sameCol(i, j, board)) {
				verticallySymetric = false;
				break;
			}
			j--;
		}
		if (verticallySymetric && horizontallySymetric) {
			return "Both";
		}
		else if (verticallySymetric) {
			return "Vertically symmetric";
		}
		else if (horizontallySymetric) {
			return "Horizontally symmetric";
		}
		return "Neither";
	}
	private boolean sameRow(int i, int j, String b[]) {
		for (int k = 0; k < b[0].length(); k++) {
			if (b[i].charAt(k) != b[j].charAt(k)) {
				return false;
			}
		}
		return true;
	}
	private boolean sameCol(int i, int j, String b[]) {
		for (int k = 0; k < b.length; k++) {
			if (b[k].charAt(i) != b[k].charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
