package Arrays;

import java.util.Arrays;

public class FillExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size1 = 3;
		char[] a1 = new char[size1];
		Arrays.fill(a1,'a');
		System.out.println("a1"+toString(a1));
	}

	private static String toString(char[] a1) {
		// TODO Auto-generated method stub
		StringBuffer b = new StringBuffer("[");
		for(int i= 0;i<a1.length;i++) {
			b.append(a1[i]);
			if(i<a1.length-1) {
				b.append(",");
			}
		}
		b.append("]");
		return b.toString();
	}

}
