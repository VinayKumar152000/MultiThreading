package synchronization;

public class MyThread2 extends Thread {

	BookTheatreSeat b;
	int seats;
	
	MyThread2(BookTheatreSeat b,int seats) {
		this.b= b;
		this.seats= seats;
	}
	
	public void run() {
		b.bookSeat(seats);
	}
	
}
