import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheGridDivTwo {
	int max = Integer.MIN_VALUE;
	public int find(int[] x, int[] y, int k) {
		go(0, 0, x, y, k);
		if (max == Integer.MIN_VALUE) {
			max = 0;
		}
		return max;
	}
	public void go(int x, int y, int bx[], int by[], int k) {
		if (k == 0) {
			max = Math.max(max, x);
			return;
		}
		boolean blockede = false;
		boolean blockedw = false;
		boolean blockedn = false;
		boolean blockeds = false;
		for (int i = 0; i < bx.length; i++) {
			if (bx[i] == x + 1 && by[i] == y) {
				blockede = true;
			}
			else if (bx[i] == x - 1 && by[i] == y) {
				blockedw = true;
			}
			else if(bx[i] == x && by[i] == y + 1) {
				blockedn = true;
			}
			else if (bx[i] == x && by[i] == y - 1) {
				blockeds = true;
			}
		}
		int bxnew[] = new int[bx.length + 1];
		int bynew[] = new int[bx.length + 1];
		for (int i = 0; i < bx.length; i++) {
			bxnew[i] = bx[i];
            bynew[i] = by[i];
		}
		bxnew[bxnew.length - 1] = x;
		bynew[bynew.length - 1] = y;
		if (!blockede) {
			go(x + 1, y, bxnew, bynew, k - 1);
		}
        if (!blockedw) {
            go(x - 1, y, bxnew, bynew, k - 1);
        }
        if (!blockeds) {
            go(x, y - 1, bxnew, bynew, k - 1);
        }
        if (!blockedn) {
            go(x, y + 1, bxnew, bynew, k - 1);
        }
        return;
	}
}
