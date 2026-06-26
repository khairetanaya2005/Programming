 class Logic
    {
        void CheckSign(int num )
        {
            if(num<0)
            {
                System.out.println("Number is negetive");
            }
            else if(num>0)
            {
                System.out.println("Number is positive");

            }
            else
            {
                System.out.println("Number is zero");

            }
            
            
            }
          

    }
        
    
    class program90
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckSign(-8);
    }  
}