/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] w=new int[n];
        for(int i=0;i<n;i++)
        {
            w[i]=sc.nextInt();
        }
        int count=0;
        int a[]=new int[501];
        Deque<Integer> ini=new LinkedList<Integer>();
        Deque<Integer> temp=new LinkedList<Integer>();
        int[] b=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
            if(a[b[i]]==0)
            {
                a[b[i]]=1;
                ini.addLast(b[i]);
            }
        }
        /*for(int i=0;i<n;i++)
        {
            ini.addLast(b[i]);
        }*/
        int top=0;
        Iterator it;
        for(int i=0;i<m;i++)
        {
            while(true)
            {
               
                top=(int)ini.removeFirst();
                if(top==b[i])
                {
                    break;
                }
                else
                {
                    temp.addFirst(top);
                }
            }
            
            while(!temp.isEmpty())
            {
                int t=(int)temp.removeFirst();
                ini.addFirst(t);
                count+=w[t-1];
            }
            ini.addFirst(top);
        }
        System.out.print(count);
    }
}