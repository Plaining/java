package Thread;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test extends Thread{
	private int threadCount;
	private String threadName;
    Test(String threadName){
    	this.threadName=threadName;
    	threadCount = 0;
    	start();
    }
    public void run() {
    	System.out.println(threadName+":"+"��ʼ");
    	try {
			while(threadCount<5) {
				Thread.sleep(30);
				System.out.println(threadName+":"+threadCount);
				threadCount++;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(threadName+"���ж�");
			e.printStackTrace();
		}
    	System.out.println(threadName+"����");
    }
/*    public static void main(String[] args) {
    	for(int i = 0;i<5;i++) {
    		new Test("�߳�"+i);
    	}
    }
*/
}