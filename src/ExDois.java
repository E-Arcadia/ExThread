
public class ExDois implements Runnable {
	Thread thread;

	@Override
	public void run() {
		Thread.State state = thread.currentThread().getState();
		System.out.println(thread.currentThread().getName() + " state is - " + state);
	}

	public static void main(String[] args) {
		Thread th1 = new Thread(new ExDois());
		Thread th2 = new Thread(new ExDois());
		th1.setName("T1");
		th2.setName("T2");
		th1.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		Thread.State state = th1.getState();
		System.out.println(th1.getName() + " state is - " + state + " \tMAIN");
		System.out.println(th2.getName() + " state is - " + th2.getState() + " \tMAIN");
		th2.start();
		try {
			th1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(th1.getName() + " state is - " + th1.getState() + " \tMAIN");
	}
}
