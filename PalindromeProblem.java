package Basics;
public class PalindromeProblem
{
    public static void main(String[] args) 
    {
            String input="madam";
            String revrse="";
            for(int i=input.length()-1;i>=0;i--)
            {
                    char c1=input.charAt(i);
                    revrse=revrse+c1;
            }
            System.out.println("The input String is-> "+input);
            System.out.println("The output String is->"+revrse);

            if(input.equalsIgnoreCase(revrse))
            {
                    System.out.println("It is a Palindrome");
            }
            else
            {
                    System.out.println("NOT A Palindrome");

            }
             
        }
}
