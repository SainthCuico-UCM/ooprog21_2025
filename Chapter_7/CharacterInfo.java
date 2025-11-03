import java.util.Scanner;

public class CharacterInfo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("The character is ");
        char aChar = input.next().charAt(0);
        
        System.out.println(aChar + (Character.isUpperCase(aChar) ? " is uppercase" : " is not uppercase"));
        System.out.println(aChar + (Character.isLowerCase(aChar) ? " is lowercase" : " is not lowercase"));
        System.out.println("After toLowerCase(), aChar is " + Character.toLowerCase(aChar));
        System.out.println("After toUpperCase(), aChar is " + Character.toUpperCase(aChar));
        System.out.println(aChar + (Character.isLetterOrDigit(aChar) ? " is a letter or digit" : " is not a letter or digit"));
        System.out.println(aChar + (Character.isWhitespace(aChar) ? " is whitespace" : " is not whitespace"));
    }
}