package Vaish;
import java.util.*;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
ArrayList a = new ArrayList();
a.add(10);
a.add(20);
a.add(30);
a.add(40);
a.add(50);
a.add(60);
System.out.println(a);
a.add(0, 100);
System.out.println(a);
a.set(0, 500);
System.out.println(a);
System.out.println(a);
System.out.println(a.contains(100));
System.out.println(a.get(3));
System.out.println(a.indexOf(50));
System.out.println(a);
for(Object s : a)
{
	System.out.println(s);
}
Iterator <Integer> i = a.iterator();
while(i.hasNext())
{
System.out.println(i.next());

	}
	}
}
