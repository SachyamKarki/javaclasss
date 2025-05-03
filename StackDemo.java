
//Imported java files
import java.util.*;
import java.util.Scanner;
public class StackDemo {
	
	
//Set up method which  reverses the string entered
    public static String reverseString(String string){
        Stack<Character>stack = new Stack<Character>();

//Converts string into a character array and store it in the Character array
        char[] charArray = string.toCharArray(); 
        
//Pushed each character from charArray into the stack
        for (char c : charArray){
            stack.push(c);
        }
//Converted the character array into string
        int index = 0;
        while(!stack.isEmpty()){
            charArray[index++] = stack.pop();
        }
        return String.valueOf(charArray);
        
    }

      //Prompt  and read a String and stores in the variable.

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a String: ");
     //Called the reverseString method with user_string as argument.
			String userString = scan.nextLine();
			String reversed = reverseString(userString);

			System.out.println("Original string is: " + userString);
			System.out.println("Reversed string is: " + reversed);
		}
    }
}
