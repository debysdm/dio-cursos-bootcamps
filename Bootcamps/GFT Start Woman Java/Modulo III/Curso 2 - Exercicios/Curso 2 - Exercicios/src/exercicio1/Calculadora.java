package exercicio1;

//Curso Entendo M�todos Java - Exercicio 1 "Cria��o"

public class Calculadora {
	
	public static void soma(double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " mais " + num2 + " � igual a: " + resultado);
	}
	
	public static void subtracao(double num1, double num2) {
		double resultado = num1 - num2;
		System.out.println("A subtra��o de " + num1 + " menos " + num2 + " � igual a: " + resultado);
	}
	
	public static void multiplicacao(double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("A multiplica��o de " + num1 + " vezes " + num2 + " � igual a: " + resultado);
	}
	
	public static void divisao(double num1, double num2) {
		double resultado = num1 / num2;
		System.out.println("A divis�o de " + num1 + " dividido " + num2 + " � igual a: " + resultado);
	}
}
