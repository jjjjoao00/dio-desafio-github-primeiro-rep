package metodosExercicio1;

public class MetodosBase {
	
	//calculadora
	public static void soma (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("O Resultado da Soma é: " + resultado);
	}
	
	public static void subtracao (double num1, double num2) {
		double resultado = num1 - num2;
		System.out.println("O Resultado da Subtração é: " + resultado);
	}
	
	public static void divisao (double num1, double num2) {
		double resultado = num1 / num2;
		System.out.println("O Resultado da Divisão é: " + resultado);
	}
	
	public static void multi (double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("O Resultado da Multiplicação é: " + resultado);
	}
	
	//mensagem de bom dia, boa tarde, boa noite

	public static void mensagemDiaTardeNoite(int hora) {

	switch (hora) {
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mensagemBomDia();
		break;
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
	case 18:
		mensagemBoaTarde();
		break;
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
	case 24:
	case 1:
	case 2:
	case 3:
	case 4:
		mensagemBoaNoite();
		break;
	default:
		System.out.println("Hora Invalida");
		break;
		}
	}
	
	public static void mensagemBomDia() {
		System.out.println("Bom Dia");
	}
	
	public static void mensagemBoaTarde() {
		System.out.println("Boa Tarde");
	}
	
	public static void mensagemBoaNoite() {
		System.out.println("Boa Noite");
	}
	
	
	//parcela e tarifa
	
	public static int duasParcelas() {
		return 2;
	}
	
	public static int tresParcelas() {
		return 3;
	}
	
	public static double taxaDuasParcelas() {
		return 0.5;
	}
	
	public static double taxaTresParcelas() {
		return 0.45;
	}
	
	public static void calculo (int parcelas, double valor) {
		if (parcelas == 2) {
			double valorFinal = valor + (valor * taxaDuasParcelas());
			System.out.println("O Valor final das parcelas é: "+ valorFinal);
			
		}else if(parcelas == 3) {
			double valorFinal = valor + (valor * taxaTresParcelas());
			System.out.println("O Valor final das parcelas é: "+ valorFinal);
			
		} else {
			System.out.println("Numero de Parcelas não aceito");
		}
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	

