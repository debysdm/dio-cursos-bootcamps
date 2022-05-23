package exercicio1;

//Exercicio de variáveis, tipos de dados e operadores aritméticos.

public class Main {

	public static void main(String[] args) {

		int i;
		//int i; variável igual a outra
		int I;
		//int 1a; não se pode começar com numéro
		int _1a; //não é bom usar esse tipo de variavel, porém não da erro.
		int $aq; //não é bom usar esse tipo de variavel, porém não da erro.
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j = 10;
		//j = 15; não tem o tipo de varivel
		int asrn24678md;
		//int asrn246 78md; Não pode ter espaço
		int asrn2$4678_md = 10;
		//int asrn2$46%78_md = 10; não pode ter caracteres especiais
		
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
