package calculadora;

import java.util.Scanner;

public class Terminal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a operação:");
	        System.out.println("1 - adição dois valores inteiros");
	        System.out.println("2 - subtração");
	        System.out.println("3 - multiplicação");
	        System.out.println("4 - divisão");
	        System.out.println("5 - potenciação");
	        System.out.println("6 - fatorial");
	        System.out.println("7 - soma com três valores inteiros");
	        
	        int tipo = scanner.nextInt();
	        int valor1 = 0;
	        int valor2 = 0;
	        int valor3 = 0;
	        int base = 0;
	        int expoente = 0;
	        
	        if(tipo == 5) {
	        	System.out.println("Digite a base: ");
	        	base = scanner.nextInt();
	        	System.out.println("Digite o expoente: ");
	        	expoente = scanner.nextInt();
	        } else if(tipo == 7) {
	        	System.out.println("Digite o valor 1: ");
		        valor1 = scanner.nextInt();
		        System.out.print("Digite o valor 2: ");
		        valor2 = scanner.nextInt();
		        System.out.println("Digite o valor 3: ");
		        valor3 = scanner.nextInt();
	        } else if(tipo == 6) {
	        	System.out.println("Digite o valor desejado: ");
	        	valor1 = scanner.nextInt();
	        } else {
	        System.out.println("Digite o valor 1: ");
	        valor1 = scanner.nextInt();
	        System.out.print("Digite o valor 2: ");
	        valor2 = scanner.nextInt();
	        }

	        scanner.close();

	        Operacao operacao = new Operacao();
	        OperacaoPotencia potencia = new OperacaoPotencia(base, expoente);
	        OperacaoSoma soma = new OperacaoSoma(valor1, valor2, valor3);

	        switch(tipo){
	           
	            case 1: System.out.println("Adição dois valores inteiros = " + operacao.soma(valor1, valor2));
	            break;

	            case 2: operacao.setNumero1(valor1);
	                    operacao.setNumero2(valor2);
	                    System.out.println("Subtração: " + operacao.subtracao());
	            break;

	            case 3: operacao.setNumero1(valor1);
	                    operacao.setNumero2(valor2);
	                    System.out.println("Multiplicação: " + operacao.multiplicacao());
	            break;   
	            
	            case 4: operacao.setNumero1(valor1);
	                    operacao.setNumero2(valor2);
	                    System.out.println("Divisão: " + operacao.divisao());
	            break;

	            case 5:	int resultado = potencia.CalcularPotencia();
	            		System.out.println("Resultado da potenciação: " + resultado);
	            break;

	            case 6: operacao.setFatorial(valor1);
	            System.out.println("Fatorial: " + operacao.getFatorial());
	            break;
	            
	            case 7: resultado = soma.CalcularSoma();
	            	System.out.println("Reultado das somas: " + resultado);

	            default: System.out.println("");
	            
	        
	        }
	    }   
	}


