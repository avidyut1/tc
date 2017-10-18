import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Xylophone {
	
	public int countKeys(int[] keys) {
		int flag[] = new int[7];
		for (int i = 0; i < keys.length; i++) {
			flag[keys[i] % 7] = 1;
		}
		int sum = 0;
		for (int i = 0; i < 7; i++) {
			sum += flag[i];
		}
		return sum;
	}
}
