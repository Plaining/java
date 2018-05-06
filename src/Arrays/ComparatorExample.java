package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

//comparator接口有两个方法：equals()和compare()方法

class ExampleComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int n1= ((CompareToExample)o1).n;
		int n2= ((CompareToExample)o2).n;
		return (n1<n2 ? -1:(n1==n2?0:1));
	}
	
}
public class ComparatorExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareToExample[] ce = new CompareToExample[5];
		CompareToExample.fill(ce, CompareToExample.generator());
		System.out.println("beforesort,ce="+Arrays.asList(ce));
		Arrays.sort(ce,new ExampleComparator());
		System.out.println("aftersort,ce="+Arrays.asList(ce));
	}
}
