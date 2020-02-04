
public class myStringToInteger {

	public static int myStringToInteger(String s) {
	    int answer = 0;
	    int factor = 1;
	    
	    for (int i = s.length() - 1; i >= 0; i--) {
	        answer = answer + (s.charAt(i) - '0') * factor;
	        factor = factor * 10;
	    }
	    return answer;
	}
}
