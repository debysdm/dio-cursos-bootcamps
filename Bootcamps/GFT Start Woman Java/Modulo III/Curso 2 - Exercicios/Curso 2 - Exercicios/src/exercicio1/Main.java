package exercicio1;

//Curso Entendo M�todos Java - Exercicio 1 "Cria��o"

public class Main {


	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("Exercicio Calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		
		//Mensagem
		System.out.println("Exercicio Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		//Empr�stimo
		System.out.println("Exercicio Empr�stimo");
		Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular( 1000, 5);
	}

}
