package lect03.threads.demo;

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("\t From Thread A: i= " + i);
		}
		System.out.println("Exit from A");
	}
}

class B extends Thread {
	public void run() {
		for (int j = 1; j <= 5; j++) {
			System.out.println("\t From Thread B: j= " + j);
		}
		System.out.println("Exit from B");
	}
}

class C extends Thread {
	public void run() {
		for (int k = 1; k <= 5; k++) {
			System.out.println("\t From Thread C: k= " + k);
		}
		System.out.println("Exit from C");
	}
}

public class ThreeThreads {
	public static void main(String args[]) {
//		new A().start();
//		new B().start();
//		new C().start();
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority() + 1);
		threadA.setPriority(Thread.MIN_PRIORITY);
		threadA.start();
		threadB.start();
		threadC.start();
	}
}
