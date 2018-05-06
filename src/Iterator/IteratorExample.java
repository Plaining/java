package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
class Color{
	private int CNumber;

	public Color(int cNumber) {
		super();
		CNumber = cNumber;
	}
	void print() {
		System.out.println("color#"+CNumber);
	}
}
public class IteratorExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		ArrayList col = new ArrayList();
		for(int i =0;i<4;i++) {
			col.add(new Color(i));
		}
		Iterator e = col.iterator();
		while(e.hasNext()) {
			((Color)e.next()).print();
		}
	}
}
