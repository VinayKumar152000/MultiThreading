package synchronization;

public class MyThread1 extends Thread {

	BookTheatreSeat b;
	int seats;
	
	MyThread1(BookTheatreSeat b,int seats) {
		this.b= b;
		this.seats= seats;
	}
	
	public void run() {
		b.bookSeat(seats);
	}
	
}
