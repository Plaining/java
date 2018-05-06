package Arrays;
//Comparable接口只有一个方法compareTo
import java.util.Arrays;
import java.util.Random;

interface Generator{
	Object next();
}
public class CompareToExample implements Comparable{
	int m;
	int n;
	
	public CompareToExample(int m, int n) {
		super();
		this.m = m;
		this.n = n;
	}

	@Override
	public String toString() {
		return "[m="+m+",n="+n+"]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int objn = ((CompareToExample)o).m;
		return (m<objn ? -1:(m==objn ? 0:1));
	}
	private static Random r = new Random();
	private static int randInt() {
		return Math.abs(r.nextInt())%50;
	}
	public static Generator generator() {
		return new Generator() {

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return new CompareToExample(randInt(),randInt());
			}
		};		
	}
	static void fill(Object[] a,int begin ,int end,Generator gen) {
		for(int i=begin;i<end;i++) {
			a[i]=gen.next();
		}
	}
	public static void fill(Object[] a,Generator gen) {
		fill(a,0,a.length,gen);
	}
	public static void main(String[] args) {
		CompareToExample[] cte = new CompareToExample[5];
		fill(cte,generator());
		System.out.println("beforesort,cte = "+Arrays.asList(cte));
		Arrays.sort(cte);
		System.out.println("aftersort,cte = "+Arrays.asList(cte));
	}
}
