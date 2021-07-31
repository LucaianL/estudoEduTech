public class criaConta {
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;		
		System.out.println(primeiraConta.saldo);
		
		conta segundaConta = new conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);

	}
}
