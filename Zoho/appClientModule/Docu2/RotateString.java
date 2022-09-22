package Docu2;

/*rotating string */
public class RotateString {

	public static void main(String[] args) {
		String s1 = "amazon";
		String s2 = "azonam";
		

		//		validate(s1, s2);

		rotateTwice(s1,s2);
		
		s1 = "geek sfor geeks";
		
		s2 = "geeksgeeksfor";
		
		rotateTwice(s1, s2);

	}

	private static void rotateTwice(String s1, String s2) {
		char[] strArr = s1.toCharArray();
		
		for (int j = 1; j <= 2; j++) {
			char temp = strArr[0];
			for (int i = 0; i < strArr.length-1; i++) {
				strArr[i] = strArr[i+1];
			}
			strArr[strArr.length-1] = temp;
		}
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != s2.charAt(i)) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}

}
