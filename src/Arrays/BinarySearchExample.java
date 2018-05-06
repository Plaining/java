package Arrays;

import java.util.Arrays;
import java.util.Random;

interface IntGenerator{
	int next();
}
class RandIntGenerator implements IntGenerator{
	private static Random rand= new Random();
	private int ran = 100;
	public RandIntGenerator() {
		
	}
	public RandIntGenerator(int ran1) {
		ran = ran1;
	}
	@Override
	public int next() {
		// TODO Auto-generated method stub
		return rand.nextInt(ran);
	}
}
public class BinarySearchExample {
	static void fill(int[] a,int begin,int end,IntGenerator gen) {
		for(int i= begin;i<end;i++) {
			a[i]=gen.next();
		}
	}
	public static void fill(int[] a,IntGenerator gen) {
		fill(a,0,a.length,gen);
	}
	public static void main(String[] args) {
		int[] bse = new int[5];
		RandIntGenerator gen = new RandIntGenerator(1000);
		fill(bse,gen);
		System.out.println("before sorted");
		for(int i=0;i<5;i++) {
			System.out.println("bse="+bse[i]);
		}
		Arrays.sort(bse);
		System.out.println("sorted array");
		for(int i=0;i<5;i++) {
			System.out.println("bse="+bse[i]);
		}
		while(true) {
			int n = gen.next();
			int loc = Arrays.binarySearch(bse, n);
			if(loc>=0) {
				System.out.println("Loc of"+n+"is"+loc+",bse["+loc+"]="+bse[loc]);
				break;
			}
		}
	}
}
