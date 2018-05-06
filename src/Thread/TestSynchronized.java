package Thread;
/*并没有起作用？synchronized的用法详解*/
public class TestSynchronized extends Thread{
	int [] a;
	private String threadName;
	
	public synchronized void plusValue(int[] a) {
		for(int i = 0;i<a.length;i++) {
			a[i]++;
		}
		System.out.println("线程"+threadName+"操作");
	}
	public synchronized void getValue(int[] a) {
		System.out.print("a[]=");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println("线程"+threadName+"输出");
	}
	TestSynchronized(int[] a, String threadName) {
		super();
		this.a = a;
		this.threadName = threadName;
		start();
	}

	public void run() {
		System.out.println("线程"+threadName+"已启动");
		try {
			Thread.sleep(500);
			plusValue(a);
			getValue(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("线程被中止");
			//e.printStackTrace();
		}
		System.out.println("线程"+threadName+"已结束");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		TestSynchronized ts1 = new TestSynchronized(a,"#1");
		TestSynchronized ts2 = new TestSynchronized(a,"#2");
		TestSynchronized ts3 = new TestSynchronized(a,"#3");
	}
}
