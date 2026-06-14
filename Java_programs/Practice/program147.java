import java.util.*;

class program146
{
    public class ArrayX
    {
        public void Update (int Arr[])
        {
            int iCnt=0;

    
            for(iCnt=0 ; iCnt<Arr.length; iCnt++)
            {
                Arr[iCnt]++;
            }
        


        }
    } 
    
    public static void main(String A[])
    {
        Scanner sobj = new Scanner (System.in);
        int iCnt=0;

        int Brr[]= {10,20,30,40,50};

        System.out.println("array elements before update  : ");
     
        for (iCnt =0; iCnt<Brr.length; iCnt++)
        {
           System.out.println(Brr[iCnt]);
        }

        ArrayX aobj = new ArrayX();
        aobj.Update(Brr);

        System.out.println("array elements after update  : ");
     
        for (iCnt =0; iCnt<Brr.length; iCnt++)
        {
           System.out.println(Brr[iCnt]);
        }



    }

}