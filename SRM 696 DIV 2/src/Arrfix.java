import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Arrfix {
	
	public int mindiff(int[] A, int[] B, int[] F) {
		boolean v[] = new boolean[A.length];
		boolean us[] = new boolean[F.length];
		for (int i = 0; i < F.length; i++) {
			int sticker = F[i];
			for (int j = 0; j < A.length; j++) {
				if (A[j] == B[j]) {
					continue;
				}
				if (B[j] == sticker && A[j] != sticker && !v[j]) {
					A[j] = sticker;
					v[j] = true;
					us[i] = true;
					break;
				}
			}
		}
		for (int i = 0; i < F.length; i++) {
			if (!us[i]) {
				for (int j = 0; j < A.length; j++) {
					if (!v[j]) {
						us[i] = true;
						v[j] = true;
						A[i] = F[i];
						break;
					}
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] != B[i]) {
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Arrfix sf = new Arrfix();
//		int[] A = new int[] {1,1,1};
//		int[] B = new int[] {2,2,2};
//		int[] F = new int[] {2};
//		System.out.println(new Arrfix().mindiff(A, B, F));

		int[] A = new int[] {2,2,2};
		int[] B = new int[] {2,2,2};
		int[] F = new int[] {1,2,3};
		System.out.println(new Arrfix().mindiff(A, B, F));
	}
}
