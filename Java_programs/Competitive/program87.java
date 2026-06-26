 class Logic
    {
        void PrintevenNumbers(int n )
        {
            int iCnt=0;
            for(iCnt=1;iCnt <= n;iCnt++)
            {
                if( iCnt % 2 == 0)
                {
                    System.out.println(iCnt);
                }
            }
          
          
        }
        
    }
    class program87
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.PrintevenNumbers(20);
    }
}