class binaryPalindrome
{
    static boolean isPalindrome(long a)
    {
        long num = a;
        long reverse = 0;
        while (a>1)
        {
            reverse <<= 1;
            if((num&1)==1)
            {
                reverse ^= 1;
            }
            a >>= 1;
        }
        return reverse == num;
    }
}
public class trys {
    public static void main(String[] args)
    {
        System.out.println(binaryPalindrome.isPalindrome(5));
    }
}
