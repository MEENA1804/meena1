#include<stdio.h>
#include<conio.h>
void main()
{

    int a;
    printf("enter a number");
    scanf("%d",&a);
    if(a==0)
    {
        printf("the given number is zero");

    }
else if(a%2==0)
{
    printf("the number is a even number");
}
else{
    printf("the number is odd number");
}
}
