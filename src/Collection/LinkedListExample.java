package Collection;

import java.util.*;

public class LinkedListExample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List fill1() {
		List l1 = new ArrayList();
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		l1.add("dd");
		l1.add("ee");
		return l1;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List fill2() {
		List l2 = new ArrayList();
		l2.add("1");
		l2.add("11");
		l2.add("22");
		l2.add("33");
		l2.add("44");
		return l2;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List fill3() {
		List l3 = new ArrayList();
		l3.add("one");
		l3.add("two");
		l3.add("three");
		l3.add("four");
		l3.add("five");
		return l3;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void testVisual(List a) {
		System.out.println("a="+a);
		List b = new ArrayList();
		b = LinkedListExample.fill3();
		System.out.print("b=");
		System.out.println(b);
		a.addAll(b);
		a.addAll(LinkedListExample.fill1());
		System.out.println("a.addAll(LinkedListExample.fill1())");
		System.out.println(a);
		ListIterator x = a.listIterator(a.size()/2);
		x.add("six");
		System.out.println(a);
		System.out.println(x.next());
		x.remove();
		System.out.println(x.next());
		x.set("red");
		System.out.println(a);
		x = a.listIterator(a.size());
		while(x.hasPrevious()) {
			System.out.print(x.previous()+" ");
		}
		System.out.println();
		System.out.println("testVisual finished");
	}
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst1 = new LinkedList();
		testVisual(lst1);
	}

}
