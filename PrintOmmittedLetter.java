//Given a non-empty string and an int n, 
//return a new string where the char at index n has been removed.
//The value of n will be a valid index of a char in the original string 
package assessment;

import java.util.Scanner;

public class PrintOmmittedLetter {
	public static void main(String[] args) {
		String str;
		int index;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		index = sc.nextInt();
		if((index > 0) && (index < str.length()))
		{
			PrintOmmittedLetter letter = new PrintOmmittedLetter();
			String result = letter.OmitCharacter(str, index);
			System.out.println(result);
		}
		else {
			System.out.println("You entered wrong index number...");
		}
	}
	
	public String OmitCharacter(String str, int n) {
		  String start = str.substring(0, n);
		  String end = str.substring(n+1, str.length());
		  return start + end;
		}
}
