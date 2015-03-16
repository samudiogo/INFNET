	
import java.util.Scanner;
public class Calculadora {
	

	private static Scanner entrada;
	public static void main(String[] args)
	{
		System.out.println("Seja bemvindo a nossa calculadora");
		System.out.print("Digite seu nome: ");
		entrada = new Scanner(System.in);
		String nome = entrada.nextLine();		
		
		int operando[] = new int[3];
		int resultado = 0;
		
		String operador = "";
		boolean run = true;
		do
		{
			menssagemCalc(nome);
			operador = entrada.nextLine();
			switch (operador)
			{
			case "+":
				operando[0] = entrada.nextInt();
				operando[1] = entrada.nextInt();
				resultado = operando[0] + operando[1];
				MostraResultado(operando, resultado, operador);
				break;
			case "-":
				operando[0] = entrada.nextInt();
				operando[1] = entrada.nextInt();
				resultado = operando[0] - operando[1];
				MostraResultado(operando, resultado, operador);
				break;
			case "!":
				operando[0] = entrada.nextInt();
				resultado = fatoracao(operando[0]);
				MostraResultado(operando, resultado, operador);
				break;
			case "*":
				operando[0] = entrada.nextInt();
				operando[1] = entrada.nextInt();
				resultado =Multiplicacao(operando[0],operando[1]);
				MostraResultado(operando, resultado, operador);
				break;
			case "D":
				operando[0] = entrada.nextInt();
				operando[1] = entrada.nextInt();
				resultado = operando[0] + operando[1];
				MostraResultado(operando, resultado, operador);
				break;
			case "P":
				operando[0] = entrada.nextInt();
				operando[1] = entrada.nextInt();
				resultado = operando[0] - operando[1];
				MostraResultado(operando, resultado, operador);
				break;
			case "q":	
				System.out.println("TCHAU");
				run = false;
				break;
			default:
				System.out.println("Operador não identificado: " + operador);
				break;
			}
			
		}
		while (run == true);
	}
	public static void menssagemCalc(String nome)
	{
		System.out.println(nome + ", Digite o codigo que representa o tipo de operação que voce deseja fazer:");
	    System.out.println("");
	    System.out.println("+ Soma              || - Subtracao");
	    System.out.println("");
	    System.out.println("* Multiplicacao     || D DIV");
	    System.out.println("");
	    System.out.println("^ Pontenciacao      || ! Fatoracao");
	    System.out.println("");
	    System.out.println("M Mod               || q para sair");
	}
	public static void MostraResultado(int[] opers, int resultado, String operador)
	{
		String operacao = "";
		for (int i = 0; i < opers.length; i++)
		{
			if(opers[i] != 0)
			{
				if(i < opers.length)
				{
					operacao += opers[i] + operador;
				}
			}
			
		}
		operacao += " = " + resultado; 
		System.out.println(operacao);
	}
	public static int fatoracao(int n)
	{
		if(n > 0)
		{
			return Multiplicacao (n,fatoracao(n - 1));
		}
		else
		{
			return 1;
		}
	}
	public static int Multiplicacao(int oper1, int oper2)
	{
		
		int result = 0;
		boolean op2IsNegative = false;
		if(oper2 < 0)
		{
			oper2= oper2 - oper2 - oper2;
			op2IsNegative = true;
			
		}
		for(int i = 1; i <= oper2; i++)
		{
			result += oper1;
		}
		if(((oper1 < 0) && (op2IsNegative == true)) || ((oper1 > 0) && (op2IsNegative== true))) 
		{
			return result - result - result;
		}
		else
		{
		return result;
		}
	}

}
