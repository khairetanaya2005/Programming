#include <stdio.h>
#include <string.h>


int main()
{
    char str[]="Jay Ganesh"; 
    int iRet=0;

    iRet = strlen(str);
    printf("Legth of string is  : %d\n",iRet);      //10

    iRet =sizeof(str);
    printf("Size of string is : %d\n",iRet); //Size of string is : 11

    return 0;
}

