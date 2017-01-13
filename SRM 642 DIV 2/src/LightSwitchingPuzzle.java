import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LightSwitchingPuzzle {
	
	public int minFlips(String state) {
		char car[] = new char[state.length() + 1];
		car[0] = '0';
		for (int i = 1; i <= state.length(); i++) {
			car[i] = state.charAt(i - 1);
		}
		int ans = 0;
		for (int i = 1; i < car.length; i++) {
			if (car[i] == 'Y') {
				car[i] = 'N';
				ans++;
				for (int j = 2 * i; j < car.length; j+= i) {
					if (car[j] == 'Y') {
						car[j] = 'N';
					}
					else {
						car[j] = 'Y';
					}
				}
			}
		}
		for (int i = 1; i < car.length; i++) {
			if (car[i] == 'Y') {
				return -1;
			}
		}
		return ans;
	}
}
