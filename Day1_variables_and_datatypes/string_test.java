package test_day1;

public class string_test {
	public static void main(String [] args){
		/* String can be manipulated as an array, but
		 * actually it is not an array
		 */
		
		//Part I: String and char Array
		
		//Build an array of characters
		char ch[] = {'a','b','m','d','k','e','i'};
		/*Use copyValueOf() to generate a string
		 */
		String chStr = String.copyValueOf(ch);
		System.out.println("String: " + chStr);
		/* also applicable to copy only a range of characters
		 * in the array
		 * 
		 * copyValueOf(charArray, start_index, str_length)
		 */
		String subStr = String.copyValueOf(ch, 3, 4);
		System.out.println("Sub string: " + subStr);
		
		//Part II: length of a string
		String s1 = "Hello World";
		System.out.println(s1.length());
		
		//Part III: character at the specific location (charAt)
		String str_test = "Hello, world";
		System.out.println(s1.charAt(0));
		System.out.println(str_test.charAt(10));
		
	}
}
