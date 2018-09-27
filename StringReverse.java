public class StringReverse {
	/*
	 Write a method that takes a string as input and returns the
	 string reversed
	 */
	
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
		
	}
	
	public static String reverseString(String str) {
		
		// using StringBuilder
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			sb.insert(0, str.charAt(i));
		}
		return sb.toString();
		
		
		
		// using character array
	/*	char[] ch = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		while(i < j) {
			char temp = ch[i];
			ch[i++] = ch[j];
			ch[j--] = temp;
		}
		return new String(ch); */
	
		
	}
	
}
