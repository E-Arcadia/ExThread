
public class ExTres implements Runnable{

	@Override
	public void run() {
		for(int x=0; x<100; x++)
			System.out.println(Thread.currentThread().getName() +" - "+ x);
	}
	
	public static void main(String[] args) {
		Thread T1 = new Thread(new ExTres());
		Thread T2 = new Thread(new ExTres());
		
		T1.setName("T1");
		T2.setName("T2");
		
		T1.start();
		T2.start();
		System.out.println("Terminou o Main");
	}
	
	
	
	

}
