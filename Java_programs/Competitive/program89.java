 class Logic
    {
        void SumEvenOddDigits(int n )
        {
            int iCnt=0,iSumEven=0,iSumOdd=0;
            int iDigit=0;
            
            while(n !=0)
            {
                iDigit = n%10;
                if(iDigit %2 ==0)
                {
                    iSumEven=iSumEven + iDigit;
                }
                else
                {
                    iSumOdd = iSumOdd+ iDigit;

                }
                n = n/10;
            }
          
        System.out.println("sum of even digits are :"+iSumEven);
        System.out.println("sum of odd digits are :"+iSumOdd);

        }
        
    }
    class program89
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(2123456);
    }  
}