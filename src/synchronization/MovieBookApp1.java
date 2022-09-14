package synchronization;

public class MovieBookApp1 {

	public static void main(String args[]) {

		// problem occur for data incositency in case when object are different , our
		// codeworks fine for single object and
		// multiple threds forthat object,but in case we have other objects and threads
		// running on it, we can have collison

		// between the threads of two different objects and hence result in data
		// inconsitency, this is becuase lock is based on
		// object
		// to avoid this we need to use static synchronized block so that locking is
		// class based
		BookTheatreSeat b1 = new BookTheatreSeat();
		BookTheatreSeat b2 = new BookTheatreSeat();

		MyThread1 t1 = new MyThread1(b1, 8);
		t1.setPriority(3);
		MyThread1 t2 = new MyThread1(b1, 5);
		t2.setPriority(6);
		MyThread2 t3 = new MyThread2(b2, 2);
		t3.setPriority(8);
		MyThread2 t4 = new MyThread2(b2, 3);
		t4.setPriority(4);
		MyThread2 t5 = new MyThread2(b2, 4);
		t5.setPriority(1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
