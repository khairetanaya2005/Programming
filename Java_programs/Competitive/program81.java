class program81
{
    class Logic
    {
        void SumOfDigits(int num)
        {
            int iDigit=0,iSum=0;

            while( num != 0)
            {

                iDigit = num % 10;
                iSum= iDigit+iSum;
                num =num/10;
            }

            System.out.println("Sum of digits :"+iSum);

        }
    }
    public static void main(String A[])
    {
        program81 pobj = new program81();
        Logic obj = pobj.new Logic();
        obj.SumOfDigits(1234);
    }
}
