
class program82
{
    class Logic
    {
        void CheckPalindrome(int num)
        {
            int iDigit=0,iRev=0;
            int temp = num;

            while( num != 0)
            {
                iDigit = num % 10;
                iRev= (iRev * 10)+ iDigit;
                num =num/10;
            }

            if(temp == iRev)
            {
                System.out.println("Number is Palindrome");
            }
            else
            {
                System.out.println("Number is Not Palindrome");
            }

        }
    }
    public static void main(String A[])
    {
        program82 pobj = new program82();
        Logic obj = pobj.new Logic();
        obj.CheckPalindrome(121);
    }
}