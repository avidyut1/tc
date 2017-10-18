import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PingPongQueue {
	
	public int[] whoPlaysNext(int[] skills, int N, int K) {
		int won[] = new int[skills.length];
        Arrays.fill(won, 0);
		Queue<Integer> queue = new LinkedList<>();
        int fp = 0;
		int sp = 1;
		for (int i = 2; i < skills.length; i++) {
			queue.add(i);
		}
		int ansl = 0, answ = 0;
		for (int i = 0; i < K; i++) {
			int winner, loser;
			if (skills[fp] > skills[sp]) {
                winner = fp;
				loser = sp;
			}
			else {
				winner = sp;
				loser = fp;
			}
			queue.add(loser);
			won[loser] = 0;
			won[winner]++;
			if (won[winner] == N) {
				queue.add(winner);
                won[winner] = 0;
				winner = -1;
			}
			ansl = loser;
			answ = winner;
			fp = winner;
			sp = queue.poll();
            if (fp == -1) {
				fp = queue.poll();
			}
		}
		return new int[]{skills[ansl], skills[answ]};
	}
}
