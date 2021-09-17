import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nod=0;
    int temp=n;
    while(temp!=0)
    {
        temp=temp/10;
        nod++;
    }
    int dig=(int)Math.pow(10,nod-1);
    
    while(dig!=0)
    {
        int q=n/dig;
        System.out.println(q);
        n=n%dig;
        dig=dig/10;
        
    }
    
    
  }
}
