package Thread;

class BlockedThread extends Thread{
	public BlockedThread() {
		System.out.println("线程开始执行");
		start();
	}
	public void run() {
		try {
			synchronized(this) {
				wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("线程被阻塞");
			//e.printStackTrace();
		}
		System.out.println("阻塞线程被中断");
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
