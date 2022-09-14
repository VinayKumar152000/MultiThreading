
class TotalEarnings extends Thread {

	int total;

	public void run() {

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total += 100;
			}

			this.notify();
		}

	}

}

public class MovieBookApp {

	public static void main(String args[]) {

		TotalEarnings te = new TotalEarnings();
		te.start();
		// if we print total here, main thread will execute before the totalearinings
		// thread calculate earinings andhence
		// we willprint total earining as 0
		// solution is to make main thread wait until total earinings is calculated and
		// than wake it
		// we use wait(),nofiy(),notifyAll()-> all are methods of object class
		// to use above methods -> the current thread must have object lock
		// else it throws java.lang.IllegalMonitorStateException exception.

		synchronized (te) {
			try {
				// at this point main thread will leave the lock of the object and te thread
				// will acquire it's lock
				// and execute it's code
				te.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("Total Earnings are " + te.total);
	}

}
