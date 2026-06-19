#include <stdio.h>

int main()
{
    char str[]={'J','a','y','\0','G','a','n','e','s','h','\0'};     //output: Jay
    printf("%s\n",str); //%s will run string till it get 1st \0 in c and cpp

    return 0;
}