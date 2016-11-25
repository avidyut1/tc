import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ListeningSongs {
	
	public int listen(int[] durations1, int[] durations2, int minutes, int T) {
		int secs = minutes * 60;
		Arrays.sort(durations1);
		Arrays.sort(durations2);
		int ans = 0;
		if (T > durations1.length)
			return -1;
		if (T > durations2.length)
			return -1;
		for (int i = 0; i < T; i++) {
			if (secs >= durations1[i]) {
				secs -= durations1[i];
				ans++;
			}
			else {
				return -1;
			}
		}
		for (int i = 0; i < T; i++) {
			if (secs >= durations2[i]) {
				secs -= durations2[i];
				ans++;
			}
			else {
				return -1;
			}
		}
		Vector<Integer> rem = new Vector<Integer>();
		for (int i = T; i < durations1.length; i++) {
			rem.add(durations1[i]);
		}
		for (int i = T; i < durations2.length; i++) {
			rem.add(durations2[i]);
		}
		Collections.sort(rem);
		for (int i = 0; i < rem.size(); i++) {
			int time = rem.get(i);
			if (secs >= time) {
				secs -= time;
				ans++;
			}
			else {
				break;
			}
		}
		return ans;
	}
}
