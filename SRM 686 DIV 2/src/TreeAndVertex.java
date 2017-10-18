import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TreeAndVertex {
	
	public int get(int[] tree) {
		int degree[] = new int[tree.length + 2];
		for (int i = 0; i < tree.length; i++) {
			degree[i + 1]++;
			degree[tree[i]]++;
		}
		Arrays.sort(degree);
		System.out.println(Arrays.toString(degree));
		return degree[degree.length - 1];
	}
}
