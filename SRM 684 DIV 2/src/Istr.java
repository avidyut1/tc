import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Istr {
	
	public int count(String s, int k) {
		int car[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			car[s.charAt(i) - 'a']++;
		}
		while(k > 0) {
			int maxind = indexmax(car);
			if(car[maxind] > 0){
				car[maxind]--;
				k--;
			}
			else {
				break;
			}
		}
		int ans = 0;
		for (int i = 0; i < 26; i++) {
			ans += (car[i] * car[i]);
		}
		return ans;
	}
	public int indexmax(int ar[]) {
		int max = 0;
		int maxind = -1;
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];maxind = i;
			}
		}
		return maxind;
	}
}
