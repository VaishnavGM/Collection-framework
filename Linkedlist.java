package Vaish;
import java.util.*;
import java.util.LinkedList;
public class Linkedlist {

	public static void main(String[] args) {
LinkedList<Integer> a = new LinkedList<Integer>();
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(400);
	System.out.println(a);
	a.addFirst(10);
	a.addLast(20);
	System.out.println(a);
System.out.println(a.getFirst());
System.out.println(a.getLast());
Iterator <Integer> i = a.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

LinkedList<String> s = new LinkedList<String>();
s.add("vaishnav");
s.add("gm");
System.out.println(s);
	}

}
