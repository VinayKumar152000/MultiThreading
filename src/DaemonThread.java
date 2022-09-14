//gfg article for daemon, digital ocean doc for while multithreding, youtube videos
public class DaemonThread extends Thread {

	// Daemon Thread is thread which run in background and serves the user thread.
	// user thread terminates all associated daemon thread will also be terminated.
	// e:g garbage collector
	// Whenever the last non-daemon thread terminates, all the daemon threads will
	// be terminated automatically.
	public DaemonThread(String name) {
		super(name);
	}

	// java.lang.IllegalThreadStateException - this exception is thrown when we are
	// peforming some task on thread and we can't
	// perform that operation in thread current state

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is a Deamon Thread");
		} else {
			System.out.println(getName() + " is a User Thread");
		}
	}

	public static void main(String args[]) {

		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		DaemonThread t3 = new DaemonThread("t3");

		// Setting user thread t1 to Daemon
		t1.setDaemon(true);

		// starting first 2 threads
		t1.start();
		t2.start();

		// Setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();
	}

}
