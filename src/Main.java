import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] icon = {{'*','x','*'},{' ','x','x'},{'*',' ','*'}};
		Scanner sc = new Scanner(System.in);
		int scale = sc.nextInt();
		
		/*
		 * step1: loop for all lines
		 * 	step 1.1: read one line.
		 * 	step 1.2: scale one line and print.
		 * 
		 */
		/*for (int i=0;i<icon.length;i++) {
			char[] line = icon[i];
		}*/
		for (char[] line:icon) { // icon is iterable. array is iterable, list is iterable, collection. 
			// we have got the line.
			scaleAndPrintLine(line, scale);
		}

	}

	private static void scaleAndPrintLine(char[] line, int scale) {
		// TODO Auto-generated method stub
		/*
		 * step 1. get a line pattern.
		 * step 2. print the line scale times.
		 */
		String pattern = getLinePattern(line, scale);
		for (int i=0;i<scale;i++) {
			System.out.println(pattern);
		}
	}

	private static String getLinePattern(char[] line, int scale) {
		// TODO Auto-generated method stub
		/*
		 * 1. For each character in the line:
		 * 	1.1 repeat the character scale times.
		 */
		String pattern = "";
		for (char c:line) {
			// we have got the character.
			for (int i=0;i<scale;i++) {
				pattern+=c;
			}
		}
		return pattern;
	}

}
