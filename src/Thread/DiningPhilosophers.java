package Thread;
import java.util.*;
//��ѧ�ҽ�������
class Chopstick{
	private static int counter = 0;
	private int number = counter++;
	public String toString() {
		return "����"+number;
	}
}
class Philosopher extends Thread{
	private static Random rand = new Random();
	private static int counter= 0;
	private int number = counter++;
	private Chopstick leftChopstick;
	private Chopstick rightChopstick;
	static int ponder;
	public Philosopher(Chopstick leftChopstick, Chopstick rightChopstick) {
		super();
		this.leftChopstick = leftChopstick;
		this.rightChopstick = rightChopstick;
		start();
	}
	public void think() {
		System.out.println(this+"��˼��");
		if(ponder>0) {
			try {
				sleep(rand.nextInt(ponder));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
	}
	public void eat() {
		synchronized(leftChopstick){
			System.out.println(this+"�õ�"+this.leftChopstick+"�ڵȴ�"+this.rightChopstick);
			synchronized(rightChopstick) {
				System.out.println(this+"�õ�"+this.rightChopstick+"�ڽ���");
			}
		}
	}
	@Override
	public String toString() {
		return "��ѧ��"+number;
	}
	public void run() {
		while(true) {
			think();
			eat();
		}
	}
}
public class DiningPhilosophers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Philosopher[] philosopher = new Philosopher[5];
		Philosopher.ponder = 0;
		Chopstick left = new Chopstick(),right=new Chopstick(),first = left;
		int i  = 0;
		while(i<4) {
			philosopher[i++]=new Philosopher(left,right);
			left = right;
			right = new Chopstick();
		}
		philosopher[i] = new Philosopher(left,first);
	}

}

//����������