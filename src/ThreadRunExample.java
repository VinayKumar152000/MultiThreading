
public class ThreadRunExample {
	
//	Implementing the java.lang.Runnable interface.
//	Extending the java.lang.Thread class.

	public static void main(String args[]) {
		// in order to make our runnable class as thread we need to pass it's object to
		// Thread class constructor

		Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
		Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");

		System.out.println("Starting Runnable Threads");
		t1.start();
		t2.start();
		System.out.println("Runnable Threads has been started");

		// creating mythread class obj to create new thread
		Thread t3 = new MyThread("t3");
		Thread t4 = new MyThread("t4");

		System.out.println("Starting MyThreads");
		t3.start();
		t4.start();

		System.out.println("MyThreads has been started");
	}

}
