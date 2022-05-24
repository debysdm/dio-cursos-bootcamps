package exercicio2;

//Exercicio 2 de variáveis, tipos de dados e operadores aritméticos.

public class Main {

	public static void main(String[] args) {


		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 20000;
		//short s2 = 40000; Muito grande
		
		//int i1 = -100000000000; Passando o limite
		int i2 = 28500;
		
		long l1 = 1000000000000000000L;
		long l2 = 2004005000500055000L;
		
		//float f1 = 4.5; Precisa colocar f no final, se não é interpretado como double
		float f2 = 10.68F;
		
		double d1 = 85.69;
		double d2 = 99.84d;
		
		char c1 = 'W';
		//char c2 = 'Tw';
		char c3 = '\u0057';
		
		String st1 = "Fulano";
		String st2 = "Cigrano";
		String st3 = "Teste 54#$# ";
		
		//String dt1 = "09/02/1981";
		
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(i2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(bo1);
		System.out.println(bo2);
	

	}

}
