import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FindingFriend {
	
	public int find(int roomSize, int[] leaders, int friendPlace) {
		int roomCount = leaders.length;
		for (int i = 0; i < roomCount; i++) {
			if (leaders[i] == friendPlace)
				return 1;
		}
		int ans = 0;
		Arrays.sort(leaders);
		for (int i = 0; i < roomCount; i++) {
			if(leaders[i] > friendPlace) break;
			if (leaders[i] == roomSize * i + 1){
				ans = 0;
			}
			ans++;
		}
		return ans;
	}
}
