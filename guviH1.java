import java.util.*;
class guviH1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int a[]=new int[n];
        TreeSet<Integer> al=new TreeSet<Integer>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        String r="",re="";
        for(int i=0;i<a.length;i++)
        {
            if(!r.contains(String.valueOf(a[i])))
            {
                r=r+String.valueOf(a[i]);
            }
            else
            {
               al.add((a[i]));
               c++;
            }
        }
        if(c>=1)
        for(int aa:al)
        {
            System.out.print(aa+" ");
        }
        else
            System.out.print("unique");
    }
}

