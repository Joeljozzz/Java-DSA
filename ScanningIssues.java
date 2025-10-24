import java.util.*;

public class ScanningIssues{
 	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		// Example of a scanning issue
		System.out.println("Enter a name: ");
		String name = scn.nextLine();
		System.out.println("Enter an integer: ");
		int	x = scn.nextInt();
		int y = scn.nextInt(); // This will cause an issue if the first input was a string and not an integer
		 // This will cause an issue because nextInt() does not consume the newline character

		for(int i=0; i<x; i++){
			System.out.println(i);
		}
		System.out.println(name); // This will not print the expected name due to the scanning issue
		System.out.println(y);
	}
}