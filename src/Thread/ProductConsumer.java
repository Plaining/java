package Thread;
/*����������������
 * ֻ����������������������ѣ���������Ϊ0������£�����������
 * */
class Operation{
	String name = "";
	Boolean bfull = false;
	public synchronized void put(String name) {
		this.name=name;
		if(bfull)
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(name+"����һ����Ʒ");
		bfull=true;
		notify();
	}
	public synchronized void get() {
		if(!bfull)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�˿�����һ����Ʒ");
			bfull = false;
			notify();
	}
}
class Producer implements Runnable{
	Operation p;
	
	public Producer(Operation p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			if(i==0) {
				p.put("kellerman");
			}else {
				p.put("kim");
			}
			i=(i+1)%2;
		}
	}
	
}
class Consumer implements Runnable{
	Operation p;
	
	public Consumer(Operation p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			p.get();
		}
	}
	
}
public class ProductConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation p = new Operation();
		new Thread(new Producer(p)).start();
		new Thread(new Consumer(p)).start();
	}

}
