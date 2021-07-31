package aula01;

public class TestaEscopo {
	public static void main(String[]args) {
		int idade = 20;
		int quantidadePessoas= 1;
		
		boolean acompanhado;
		if (quantidadePessoas >= 2) {
			acompanhado=true;
		}else {
			acompanhado=false;
			System.out.println("infelizmente voce esta desacompanhado :(");
		}
		if (idade >=18 && acompanhado){
			System.out.println("Seja bem vindo");	
		}else{
			System.out.println("infelizmente você vai ter que sair");
		}
		}
}
