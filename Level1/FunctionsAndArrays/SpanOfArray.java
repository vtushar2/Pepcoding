import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
 
int n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.print(display(a,n));
}
 
public static int display(int[] x,int n)
{
int gap=0,max=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(x[i]==x[j])
{
gap=j;
}
}
if(gap-i>max)
max=gap-i;
 
}
return max+1;
}
 
}
