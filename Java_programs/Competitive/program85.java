 class Logic
    {
        void PrintTable(int a )
        {
            int iCnt=0,iMulti=0;
            for(iCnt=1;iCnt<=10;iCnt++)
            {
               iMulti =iCnt *a;
               System.out.println(iMulti);
            }
        }
        
    }
    class program85
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.PrintTable(5);
    }
}