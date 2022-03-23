class exp6
{
public static void main(String arg[])
{
System.out.println("___Paliendrome or not___");
int num=454;
System.out.println("Given Number is :"+num);
int r,sum=0,temp;
temp=num;
while(num>0)
{
r=num%10;
sum=sum*10+r;
num=num/10;
}
if(temp==sum)
System.out.println("Paliendrome");
else
System.out.println("Not Paliendrome");
}
}