import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearSong {
	
	public int countRareNotes(int[] notes) {
		int freq[] = new int[1001];
		for (int i = 0; i < notes.length; i++) {
			freq[notes[i]]++;
		}
		int ans = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 1) {
				ans++;
			}
		}
		return ans;
	}
}
