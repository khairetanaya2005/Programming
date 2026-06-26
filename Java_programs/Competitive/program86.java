 class Logic
    {
        void CheckPrime(int num )
        {
            int iCnt=0,iMulti=0;
            for(iCnt=2;iCnt < num;iCnt++)
            {
                if(num%iCnt ==0)
                {
                    break;
                }
            }
            if(iCnt==num)
            {
                System.out.println("Number is Prime");
            }
            else
            {
                System.out.println("Number is  not Prime");

            }
            
          
        }
        
    }
    class program86
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckPrime(11);
    }
}