import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class VerySecureEncryption {
	
	public String encrypt(String message, int[] key, int K) {
		char car[] = message.toCharArray();
		int n = car.length;
		for (int i = 0; i < K; i++) {
			char newcar[] = new char[n];
			System.arraycopy(car, 0, newcar, 0, n - 1);
			for (int j = 0; j < n; j++) {
				newcar[key[j]] = car[j];
			}
			car = newcar;
		}
		return new String(car);
	}
}
