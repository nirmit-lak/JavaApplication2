import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// linkedin test

public class Main1
{
    static StringTokenizer st=new StringTokenizer("");
    static BufferedReader br;
    ///////////////////////////////////////////////////////////////////////////////////
    
    public static void main(String args[]) throws FileNotFoundException, IOException, Exception
    {
        //Scanner in =new Scanner(new FileReader("input.txt"));
        //PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        //Scanner in=new Scanner(System.in);
        br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        //StringTokenizer st;//=new StringTokenizer(br.readLine());
        //////////////////////////////////////////////////////////////////////////////////////
        
        int n=ni();
        int arr[]=new int[3];
        arr[0]=ni();
        arr[1]=ni();
        arr[2]=ni();
        int dp[]=new int[n+1];
        for(int i=1;i<=n;i++) dp[i]=-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<3;j++) if(i-arr[j]>=0 && dp[i-arr[j]]>=0) dp[i]=Math.max(dp[i],dp[i-arr[j]]+1);
        }
        out.print(dp[n]);
        
        //////////////////////////////////////////////////////////////////////////////////////
	out.close();
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////
    
    private static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    private static class pair implements Comparable<pair>
    {
        int first;
        int second;
        pair()
        {
            first=0;
            second=0;
        }
        pair(int f,int s)
        {
            first=f;
            second=s;
        }

        public int compareTo(pair o)
        {
            if(first+second >  o.first+o.second)
                return 1;
            else if(first+second < o.first+o.second)
                return -1;
            else
                return 0;
        }
    }
    
    public static Integer ni() throws Exception
    {
        if(!st.hasMoreTokens())
            st=new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }
    public static BigInteger nb()throws Exception
    {
        if(!st.hasMoreElements())
            st=new StringTokenizer(br.readLine());
        return BigInteger.valueOf(Long.parseLong(st.nextToken()));
    }
    public static Long nl() throws Exception
    {
        if(!st.hasMoreTokens())
            st=new StringTokenizer(br.readLine());
        return Long.parseLong(st.nextToken());
    }
    public static Double nd()throws Exception
    {
        if(!st.hasMoreElements())
            st=new StringTokenizer(br.readLine());
        return Double.parseDouble(st.nextToken());
    }
    public static String ns()throws Exception
    {
        if(!st.hasMoreElements())
            st=new StringTokenizer(br.readLine());
        return st.nextToken();
    }
}