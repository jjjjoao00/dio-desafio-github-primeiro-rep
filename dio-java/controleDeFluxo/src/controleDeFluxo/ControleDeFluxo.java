package controleDeFluxo;

public class ControleDeFluxo {

	public static void main(String[] args) {
		//COM IF EXIBA O NOME DO MES DO ANO DE ACORDO
		//COM O NUMERO, EVITAR EFEITO FLECHA
		//COM OUTRO IF VERIFIQUE SE O MES É JULHO, DEZEMBRO OU JANEIRO
		//EXIBA O TEXTO "FÉRIAS
		//COM SWITCH USE STRING PARA A PARTIR DO DIA DA SEMANA
		//EXIBIR SEU NUMERO,
		
		int mesAno = 2;
		String diaSemana = "Quarta";
		int certo = 15;
		String mes = "Fevereiro";
		
		
		//switch do dia da semana
		switch (diaSemana) {
		
		case "Domingo":
			System.out.println("1");
			break;
		case "Segunda":
			System.out.println("2");
			break;
		case "Terça":
			System.out.println("3");
			break;			
		case "Quarta":
			System.out.println("4");
			break;
		case "Quinta":
			System.out.println("5");
			break;
		case "Sexta":
			System.out.println("6");
			break;
		case "Sábado":
			System.out.println("7");
			break;
		
		}
		
		
		//if do mes e das ferias
		if (mesAno == 1) {
			System.out.println("Janeiro");
		}
		
		if (mesAno==2) {
			System.out.println("Fevereiro");
		}
		
		if (mesAno == 3) {
			System.out.println("Março");
		}
		
		if (mesAno==4) {
			System.out.println("Abril");
		}
		
		if (mesAno == 5) {
			System.out.println("Maio");
		}
		
		if (mesAno==6) {
			System.out.println("Junho");
		}
		
		if (mesAno == 7) {
			System.out.println("Julho");
		}
		
		if (mesAno==8) {
			System.out.println("Agosto");
		}
		
		if (mesAno == 9) {
			System.out.println("Setembro");
		}
		
		if (mesAno==10) {
			System.out.println("Outubro");
		}
		
		if (mesAno == 11) {
			System.out.println("Novembro");
		}
		
		if (mesAno==12) {
			System.out.println("Dezembro");
		}
		
		
		
		
		
		//COM SWITCH SE UMA VARIAVEL INTEIRA FOR ENTRE 1 E 3 EXIBIR O TEXTO "CERTO"
		//SE FOR 4, EXIBIR "ERRADO"
		//SE FOR 5 "TALVEZ
		//PARA DEMAIS VALORES EXIBIR "VALOR INDEFINIDO"
		
		switch(certo) {
		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
			
		case 4:
			System.out.println("Errado");
			break;
			
		case 5:
			System.out.println("Talvez");
			break;
			
		default:
			System.out.println("Valor Indefinido");
			break;
		}
		
		switch (mes) {
		case "Janeiro":
		case "Julho":
		case "Dezembro":
			System.out.println("Férias! :>");
			break;
			
		default:
			System.out.println("Infelizmente não é férias :<");
			break;
		}
	}

}
