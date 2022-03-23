class exp7
{
public static void main(String arg[])
{
System.out.println("___Armstrong or not___");
int num=153;
System.out.println("Given Number is :"+num);
int r,sum=0,temp;
temp=num;
while(num>0)
{
r=num%10;
sum=sum+(r*r*r);
num=num/10;
}
if(temp==sum)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}