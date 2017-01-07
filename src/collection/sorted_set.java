/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author nirmit
 */
public class sorted_set {
    public static void main(String args[])
    {
        SortedSet<Integer> s=new TreeSet<Integer>();
        s.add(5);
        s.add(3);
        s.add(4);
        s.add(1);
        s.add(9);
        Iterator it=s.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
