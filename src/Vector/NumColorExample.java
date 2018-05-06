package Vector;
/*
 * 使用java容器的确存在缺点，在将对象加入容器时，丢失了该对象本身的类型。
 * 
 * */
import java.util.ArrayList;
import java.util.List;
 
class Num{
	private int nNumber;
	public Num(int i) {
		nNumber = i;
	}
	void print() {
		System.out.println("Num#"+nNumber);
	}
}
class Color{
	private int CNumber;

	public Color(int cNumber) {
		super();
		CNumber = cNumber;
	}
	void print() {
		System.out.println("Color#"+CNumber);
	}
}
public class NumColorExample {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		List num = new ArrayList();
		for(int i =0;i<4;i++) {
			num.add(new Num(i));
		}
		num.add(new Color(4));
		for(int i=0;i<num.size();i++) {
			((Num)num.get(i)).print();
		}
	}
}
