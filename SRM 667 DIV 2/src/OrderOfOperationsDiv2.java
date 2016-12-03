import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class OrderOfOperationsDiv2 {
	
	public int minTime(String[] s) {
		Vector<Task> st = new Vector<Task>();
		for (int i = 0; i < s.length; i++) {
			st.add(new Task(s[i]));
		}
		Collections.sort(st);
		boolean mused[] = new boolean[s[0].length()];
		int ans = 0;
		for (int j = 0; j < st.size(); j++) {
			Task t = st.get(j);
			int countuniq = 0;
			for (int i = 0; i < t.s.length(); i++) {
				if (t.s.charAt(i) == '1' && !mused[i]) {
					mused[i] = true;
					countuniq++;
				}
			}
			ans += Math.pow(countuniq, 2);
		}
		System.out.println(st);
		return ans;
	}
}
class Task implements Comparable<Task>{
	String s;
	public Task(String s) {
		this.s = s;
	}

	@Override
	public int compareTo(Task that) {
        int countthis = 0;
		int countthat = 0;
		for (int i = 0; i < this.s.length(); i++) {
			if (this.s.charAt(i) == '1') {
				countthis++;
			}
		}
		for (int i = 0; i < that.s.length(); i++) {
			if (that.s.charAt(i) == '1') {
				countthat++;
			}
		}
		return countthis - countthat;
	}

	@Override
	public String toString() {
		return this.s;
	}
}
