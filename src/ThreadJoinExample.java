
public class ThreadJoinExample {

	/*
	 * Sometimes we need to wait for other threads to finish their execution before
	 * we can proceed. We can achieve this using the Thread join method
	 */
	public static void main(String args[]) {

		Thread t1 = new Thread(new MyRunnable(), "t1");
		Thread t2 = new Thread(new MyRunnable(), "t2");
		Thread t3 = new Thread(new MyRunnable(), "t3");

		t1.start();

		// start thread 2 after waiting for 2 sec or t1 is dead
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();

		// start thread t3 only when t1 is dead
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t3.start();

		// let all threads finish execution before finishing main thread
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All threads are dead,exiting main Thread");

	}

}
