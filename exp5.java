class exp5
{
public static void main(String arg[])
{
int num=123,rev=0;
System.out.println("___Reverse of a number___");
System.out.println("Given Number :"+num);
while(num!=0)
{
int rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println("Reverse of a number :"+rev);
}
}