import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int oval=1;
        int nsp=n/2;
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            int val=oval;
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print(val+"\t");
                if(j<=nst/2)
                {
                    val++;
                }
                else
                {
                    val--;
                }
            }
            System.out.println();
            if(i<=n/2)
            {
                oval++;
                nst+=2;
                nsp--;
            }
            else
            {
                oval--;
                nst-=2;
                nsp++;
            }
        }

    }
}
