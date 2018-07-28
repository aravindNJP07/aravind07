import java.util.*;
class guviH3
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
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==i)
            {
                ts.add(a[i]);
            }
        }
        for(int f:ts)
        {
            System.out.print(f+" ");
        }
    }
}
