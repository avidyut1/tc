import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RemovingParenthesis {

	private int count = 0;
    Queue<String> stToProcess = new LinkedList<>();
	public int countWays(String s) {
		stToProcess.add(s);
		while(stToProcess.size() != 0){
			process(stToProcess.poll());
			count = Math.max(count, stToProcess.size());
		}
		return count;
	}
	public void process(String s) {
		String news = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				news = s.substring(0, i) + s.substring(i + 1);
				break;
			}
		}
		removeClose(news);
	}
	public void removeClose(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				String news = s.substring(0, i) + s.substring(i + 1);
				if (valid(news)) {
					if (news.length() > 0) {
						stToProcess.add(news);
					}
				}
			}
		}
	}
	public boolean valid(String s) {
        int countOpen = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				countOpen++;
			}
			else {
				countOpen--;
			}
			if (countOpen < 0) {
				return false;
			}
		}
		if (countOpen == 0) {
			return true;
		}
		return false;
	}
}
