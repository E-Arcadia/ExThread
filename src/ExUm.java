
public class ExUm {
	
	public ExUm() {
		Thread TDois = new Thread(new ExemploThread("TDois"));
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Rodou thread TUm!!!");
			}
		}).start();
		
		TDois.start();
		
		
		System.out.println("Terminou o constructor!!!");
	}

	
	
	public static void main(String[] args) {
		new ExUm();
		System.out.println("Terminou o MAIN!!!");
	}

}



// Exemplo de uma classe interna 
// e implementa Runnable
class ExemploThread implements Runnable {
	private String nome;
	
	public ExemploThread(String nom) {
		nome = nom;
	}

	@Override
	public void run() {
		System.out.println("Rodou thread "+ nome);
		
	}
	

}
