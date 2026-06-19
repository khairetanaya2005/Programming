#include <stdio.h>

void Display(char str[])
{
    printf("input string is :%s\n",str);
}
int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string\n");
    scanf("%[^'\n']s",Arr);    //regex regular expression

    Display(Arr);
    
    return 0;
}


