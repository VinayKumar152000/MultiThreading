
//thread creation using runnable interface
//implements runnable interface
public class HeavyWorkRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Doing heavy processing -> start " + Thread.currentThread().getName());

		try {
			Thread.sleep(1000);
			// get db connection
			doDBProcessing();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Doing heavy processing - end " + Thread.currentThread().getName());

	}

	// interupted exception may occur while thread is in sleep, when thread got
	// interrupted
	public void doDBProcessing() throws InterruptedException {
		Thread.sleep(5000);
	}

}
