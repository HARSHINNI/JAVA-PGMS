class ArmstrongNumber
{  
public static void main(String[] args)  
{  
int c=0,a,temp;  
int n=153;// (1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, ... )
temp=n;  
while(n>0)  
{  
a=n%10;  
n=n/10;  
c=c+(a*a*a);  
}  
if(temp==c)  
System.out.println("armstrong number");   
else  
System.out.println("Not armstrong number");   
}  
}  