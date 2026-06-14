import java.util.*;

class DigitX
{
    public boolean CheckPalinmdrome(int iNo)
    {
        int iDigit=0;
        int iRev=0;
        int iTemp=0;

        iTemp = iNo;

        while(iNo !=0)
        {
               
           iDigit = iNo %10;
           iRev=(iRev*10)+iDigit;
           iNo= iNo / 10;

        }
        if(iRev== iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
            

}
public class program93
{
    public static void main (String A[])
    {
        Scanner sobj=new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue=0;
        boolean bRet = true;

        System.out.println("Enter number: ");
        iValue = sobj.nextInt();

        bRet = dobj. CheckPalinmdrome(iValue);
        
        if(bRet == true)
        {
            System.out.println("number is palindrome");
        }
        else
        {
            System.out.println("number is not palindrome");

        }




    }
    
}

