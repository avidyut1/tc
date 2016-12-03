import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DevuAndGame {
	boolean ans = false;
	public String canWin(int[] nextLevel) {
		int n = nextLevel.length;
		boolean v[] = new boolean[n];
		go(0, nextLevel, v);
        if (ans)
        	return "Win";
		return "Lose";
	}
	public void go(int i, int nl[], boolean v[]) {
		if (nl[i] == -1) {
			ans = true;
			return;
		}
        if (v[i])
        	return;
		v[i] = true;
        go(nl[i], nl, v);
	}
}
