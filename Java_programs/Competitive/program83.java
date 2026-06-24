 class Logic
    {
        void FindMax(int a ,int b)
        {
            if(a>b)
            {
                System.out.println("Maximum is"+a);

            }
            else
            {
                System.out.println("Maximum is"+b);

            }

        }
    }
    class program83
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.FindMax(20,15);
    }
}