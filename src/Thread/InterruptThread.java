package Thread;

class BlockedThread extends Thread{
	public BlockedThread() {
		System.out.println("�߳̿�ʼִ��");
		start();
	}
	public void run() {
		try {
			synchronized(this) {
				wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("�̱߳�����");
			//e.printStackTrace();
		}
		System.out.println("�����̱߳��ж�");
	}
}
public class InterruptThread {
	static BlockedThread bt = new BlockedThread();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			bt.interrupt();
			bt=null;
	}

}
