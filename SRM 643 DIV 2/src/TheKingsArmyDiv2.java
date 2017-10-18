import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheKingsArmyDiv2 {
	
	public int getNumber(String[] state) {
		int n = state.length;
		int m = state[0].length();
		char car[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			car[i] = state[i].toCharArray();
		}
		boolean oneh = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (car[i][j] == 'H') {
					oneh = true;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j + 1 < m && car[i][j] == car[i][j + 1] && car[i][j] == 'H') {
					return 0;
				}
				if (i + 1 < n && car[i][j] == car[i + 1][j] && car[i][j] == 'H') {
					return 0;
				}
			}
		}
		if (oneh)
			return 1;
		return 2;
	}
}
