package Vaish;
import java.util.*;
import java.util.Vector;

public class Vectoriss {

	public static void main(String[] args) {
Vector v = new Vector();
Vector s = new Vector();

s.add(10);
s.add(20);
v.add(100);
v.add(200);
v.add(300);
v.add(400);
v.add(4, 500);
System.out.println(v);
System.out.println(v.capacity());
System.out.println(v.contains(100));
System.out.println(v.firstElement());
System.out.println(v.lastElement());
System.out.println(v.clone());
System.out.println(v.remove(3));
System.out.println(v.removeElement(500));
System.out.println(v);
System.out.println(v.addAll(0, s));
System.out.println(v);
System.out.println(v.containsAll(s));
v.addElement(100);
System.out.println(v.listIterator());
Iterator i = v.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
for(Object x : v)
{
	System.out.println(x);
}

v.clear();
System.out.println(v);
	}
	

}
