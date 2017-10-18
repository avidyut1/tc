import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DNASequence {
	
	public int longestDNASequence(String sequence) {
		String dna = "ACGT";
		int res = 0;
		char car[] = sequence.toCharArray();
		for (int i = 0; i < car.length; i++) {
			for (int j = i; j < car.length; j++) {
				boolean ans = true;
				for (int k = i; k <= j; k++) {
					if (dna.indexOf(car[k]) < 0) {
						ans = false;
						break;
					}
				}
				if (ans) {
					res = Math.max(res, j - i + 1);
				}
			}
		}
		return res;
	}
}
