public class testeReferencias {
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		conta segundaConta = primeiraConta; //a segunda conta se "torna" a primeira
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
	}
}
