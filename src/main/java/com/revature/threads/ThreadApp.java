package com.revature.threads;

public class ThreadApp {

	public static void main(String[] args) {
//		for (int i = 0; i < 50; i++) {
//			// Extending Thread, instantiate, then start
//			new CustomThread().start();
//
//			// Implement Runnable, then pass to a Thread, then start
//			new Thread(new CustomRunnable()).start();
//
//			// Implement Anonymous Runnable
//			new Thread(new Runnable() {
//				public void run() {
//					System.out.println("Doing something in anonymous runnable");
//				}
//			}).start();
//			
//			// Implement Runnable lambda
//			new Thread( () -> System.out.println("Doing something in a lambda runnable")).start();
//		}

		CustomThread ct = new CustomThread();
		ct.start();
		synchronized(ct) {
			try {
				ct.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(ct.counter);
		}
	}

}

class CustomThread extends Thread {
	int counter;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++)
				counter += 1;
			
			notify();
		}
	}
}

class CustomRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Doing something in Custom Runnable");
	}

}