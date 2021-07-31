
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(234, 2324);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente ();
		paulo.setNome("paulo");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}
}
