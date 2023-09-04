package s0904;

public class MultiThread_2 {

	public static void main(String[] args) {
		
		MyRunnable myRun1 = new MyRunnable();
		MyRunnable myRun2 = new MyRunnable();
		MyRunnable myRun3 = new MyRunnable();
		
		myRun1.setPrint(".");
		myRun2.setPrint("$");
		myRun3.setPrint("%");
		
		Thread mythread1 = new Thread(myRun1);
		Thread mythread2 = new Thread(myRun2);
		Thread mythread3 = new Thread(myRun3);
		
		mythread1.start();
		mythread2.start();
		mythread3.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.print("* ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class MyRunnable implements Runnable{

	String str;
	
	void setPrint(String s) {
		str = s;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print(str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}