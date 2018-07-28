import java.util.*;
class guviH4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            c=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j] && (i!=j))
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print(a[i]+" ");
                
            }
        }
    }
}
