package prob04;
public class Sol04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		StringBuffer sb = new StringBuffer(str);
		String res = sb.reverse().toString();
		char[] res2 = res.toCharArray();
		return res2;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */

		System.out.println(String.valueOf(array));
	}
}