import java.util.Scanner;
public class Palindromechecker
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        int number=scanner.nextint();
        if(isPalindrome(number))
        {
            System.out.println(number+" is a palindrome.");
        }
        else{
            System.out.println(number+"is not palindrome.");
        }
    }
    public static boolean isPalindrome(int number)
    {
        int orignalNumber=number;
        int reverse=0;
        while(number!=0)
        {
            int remainder=number% 10;
            reverse= reverse*10+remainder;
            number/=10;
        }
        return orignalNumber==reverse;
    }
}