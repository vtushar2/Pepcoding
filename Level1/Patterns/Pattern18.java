import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     int nsp=0;
     int nst=n;
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=nsp;j++)
         {
             System.out.print("\t");
         }
         for(int j=1;j<=nst;j++)
         {
             if(i>1 && i<=n/2)
             {
                 if(j==1 || j==nst)
                 {
                     System.out.print("*\t");
                 }
                 else
                 {
                     System.out.print("\t");
                 }
             }
             else
             {
                 System.out.print("*\t");
             }
         }
         System.out.println();
         if(i<=n/2)
         {
             nst-=2;
             nsp++;
         }
         else
         {
             nsp--;
             nst+=2;
         }
     }
     

 }
}
