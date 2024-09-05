package ExerciciosPOO;

import java.util.Scanner;

public class ExerciciosPoo {
	public static void main(String[] args) {
		//Nome();
		//ParOuImpar();
		//multiplicacao();
		//pessoas();
		//numero();
		//situacaoAluno();
		calculadoraSalario();
	}
	public static void Nome () {
		String nome = "Andressa";
		String sobrenome = "Jandre";
		
		System.out.println("Meu nome é: " + nome + "\nMeu sobrenome é: " + sobrenome);
	}
	public static void ParOuImpar() {
		int inicio = 1;
		int fim = 30;
		
		System.out.println("Números Pares:");
		for (int i = inicio; i <= fim; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Números Impares:");
		for (int i = inicio; i <= fim; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	public static void multiplicacao() {
		
		int numero = 2;
		
		System.out.println("Tabuada de multiplicação do número " + numero + " :");
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}
	public static void pessoas() {
		Scanner scanner = new Scanner(System.in);
		
		double pesoPessoa = 0;
		double alturaPessoa = 0;
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Pessoa" + i + ":");
			
			System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            
            System.out.println("Digite a altura: ");
            double altura = scanner.nextDouble();
            alturaPessoa += altura;
            
            System.out.println("Digite o peso: ");
            double peso = scanner.nextDouble();
            pesoPessoa += peso;
            
            scanner.nextLine();
		}
		double mediaAltura = alturaPessoa / 4;
		double mediaPeso = pesoPessoa / 4;
		
		System.out.println("Média de altura: " + mediaAltura + "em metros");
		System.out.println("Média de peso: " + mediaPeso + "em kg");
	}
	
	 public static void numero() {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite um número inteiro: ");
	     int numero = scanner.nextInt();
	     
	     int antecessor = numero - 1;
	     int sucessor = numero + 1;
	     
	     System.out.println("Antecessor: " + antecessor);
	     System.out.println("Sucessor: " + sucessor);
	        
	     scanner.close();
	 }
	
	 public static void situacaoAluno() {
		 
		double nota1 = 9.7;
		double nota2 = 9.9;
			
		double media = (nota1 + nota2) / 2;
			
		if (media >= 7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
			
	 }
	 
	public static void calculadoraSalario() {
		 
		String nome = "Andressa";
		double salario = 4000.00;
		double descontoSalario;
			
			
		if (salario <= 1751.81) {
			descontoSalario = (salario * 0.08);
		} else if (salario <= 2919.72) {
			descontoSalario = (salario * 0.09);
		} else if (salario <= 5839.45) {
			descontoSalario = (salario * 0.10);
		} else {
			descontoSalario = (salario * 0.11);
		}
			
		double salarioComDesconto = salario - descontoSalario;
			
		System.out.println("A funcionária " + nome + " receberá este mês o total de: " + salarioComDesconto + " com todos os descontos.");
	}
	 
}
    