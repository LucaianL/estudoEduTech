public class testaMetodo {
	public static void main(String[] args) {
		conta contah = new conta();
		contah.saldo = 100;
		contah.deposita(50);
		
		System.out.println(contah.saldo);
		
		boolean conseguiuRetirar = contah.saca(20);
		System.out.println(contah.saldo);
		System.out.println(conseguiuRetirar);
		
		conta contaDaMarcela = new conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contah);
		
		System.out.println(contaDaMarcela.saldo);
		
		contah.titular = "Lucaian Lutke";
		System.out.println(contah.titular);
		
	}
}
