package exercicio1;

//Exercicio de vari�veis, tipos de dados e operadores aritm�ticos.

public class Main {

	public static void main(String[] args) {

		int i;
		//int i; vari�vel igual a outra
		int I;
		//int 1a; n�o se pode come�ar com num�ro
		int _1a; //n�o � bom usar esse tipo de variavel, por�m n�o da erro.
		int $aq; //n�o � bom usar esse tipo de variavel, por�m n�o da erro.
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j = 10;
		//j = 15; n�o tem o tipo de varivel
		int asrn24678md;
		//int asrn246 78md; N�o pode ter espa�o
		int asrn2$4678_md = 10;
		//int asrn2$46%78_md = 10; n�o pode ter caracteres especiais
		
		asrn24678md = 100;
		asrn2$4678_md = 100;
		
		int quantidadeProduto = 50;
		//int QuantidadeProduto;
		final int NUMERO_TENTATIVAS = 5;
		//final int numeroTentativas = 5;
		int QUANTIDADE_OPCOES = 25;
		//int qtdProf;
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		
		System.out.println(j);
		System.out.println(asrn24678md);
		System.out.println(asrn2$4678_md);
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);

	}

}
