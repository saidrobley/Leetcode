

public class ReverseInteger {
	
	public static void main(String[] args) {
		System.out.println(reverse(120));
	}
	public static int reverse(int x) {
		boolean negative = false;
		if(x < 0) {
			negative = true;
			x *= -1;
		}
		long reverse = 0;
		StringBuilder sb = new StringBuilder();
		while (x > 0) {
			reverse = (reverse * 10) + (x % 10);
			sb.append(reverse);
			x /= 10;
			
		}
		if(reverse > Integer.MAX_VALUE){
			return 0;
		}
		return negative ? (int)(-1 * reverse) : (int) reverse;
	}
	
}
