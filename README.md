# 🌟 Exercícios de Programação Orientada a Objetos em Java 🌟

## Introdução
Este projeto contém uma série de exercícios de **Programação Orientada a Objetos (POO)** desenvolvidos em **Java** utilizando o **Eclipse IDE**. Cada método presente no código exemplifica a aplicação de conceitos básicos de programação, como controle de fluxo, cálculo aritmético, uso de laços e operações com entradas do usuário.

## Índice 🌀
- [Descrição dos Exercícios](#descrição-dos-exercícios)
  - [Nome Completo](#nome-completo)
  - [Par ou Ímpar](#par-ou-ímpar)
  - [Tabuada de Multiplicação](#tabuada-de-multiplicação)
  - [Cálculo de Média de Peso e Altura](#cálculo-de-média-de-peso-e-altura)
  - [Antecessor e Sucessor](#antecessor-e-sucessor)
  - [Situação do Aluno](#situação-do-aluno)
  - [Calculadora de Salário](#calculadora-de-salário)
- [Como Usar](#como-usar)
- [Instalação](#instalação)
- [Licença](#licença)

## Descrição dos Exercícios

### Nome Completo
- **Descrição**: O método `Nome` exibe o nome e sobrenome de uma pessoa.
- **Funcionalidade**: Utiliza variáveis de string para armazenar o nome e sobrenome e exibe a combinação na saída.

```java
public static void Nome () {
    String nome = "Andressa";
    String sobrenome = "Jandre";
    System.out.println("Meu nome é: " + nome + "\nMeu sobrenome é: " + sobrenome);
}
```

### Par ou Ímpar
- **Descrição**: O método ParOuImpar imprime os números pares e ímpares dentro de um intervalo de 1 a 30.
- **Funcionalidade**: Usa laços for e condicionais para determinar e exibir números pares e ímpares.

```java
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
```

### Tabuada de Multiplicação
- **Descrição**: O método multiplicacao exibe a tabuada de multiplicação para um número fixo (2).
- **Funcionalidade**: Utiliza um laço for para calcular e exibir os resultados da multiplicação.

```java
public static void multiplicacao() {
    int numero = 2;

    System.out.println("Tabuada de multiplicação do número " + numero + " :");
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
    }
}
```

### Cálculo de Média de Peso e Altura
- **Descrição**: O método pessoas solicita dados (nome, peso, altura) de quatro pessoas e calcula a média de altura e peso.
- **Funcionalidade**: Utiliza o objeto Scanner para entrada de dados e realiza cálculos para determinar a média.

```java
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
```

### Antecessor e Sucessor
- **Descrição**: O método numero solicita um número inteiro ao usuário e exibe seu antecessor e sucessor.
- **Funcionalidade**: Realiza operações aritméticas simples de adição e subtração.

```java
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
```

### Situação do Aluno
- **Descrição**: O método situacaoAluno calcula a média de duas notas fixas e exibe se o aluno foi aprovado ou reprovado.
- **Funcionalidade**: Utiliza uma condicional if para determinar a aprovação com base na média das notas.

```java
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
```

### Calculadora de Salário
- **Descrição**: O método calculadoraSalario calcula o salário líquido de uma funcionária, descontando uma porcentagem baseada em faixas salariais.
- **Funcionalidade**: Aplica condições if e cálculos percentuais para determinar o valor do desconto.

```java
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
```

## Como Usar
- Clone este repositório ou baixe os arquivos.
- Importe o projeto no Eclipse IDE.
- Escolha o método que deseja executar removendo o comentário da chamada na função main().
- Execute o programa clicando com o botão direito no arquivo e selecionando Run As > Java Application.

## Instalação  💻
- Baixe e instale o Eclipse IDE ou qualquer outra IDE de sua escolha.
- Certifique-se de ter o JDK (Java Development Kit) instalado e configurado no seu sistema.
- Importe o projeto e execute os métodos conforme descrito na seção Como Usar.

## Licença ✔️
- Este projeto é de uso livre para fins acadêmicos e pessoais.
