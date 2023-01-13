package metodosExercicio1;

public class AplicacaoMetodos {
	public static void main(String[] args) {

	//MetodosBase MetodosBase = new MetodosBase();
	
	//calculadora
	MetodosBase.soma(2, 2);
	MetodosBase.subtracao(2, 2);
	MetodosBase.divisao(2, 2);
	MetodosBase.multi(2, 2);
	
	//mensagem
	
	MetodosBase.mensagemDiaTardeNoite (1);
	MetodosBase.mensagemDiaTardeNoite (1);
	MetodosBase.mensagemDiaTardeNoite (30);
	
	//calculo taxas e parcelas
	
	MetodosBase.calculo(2, 1.500);
	MetodosBase.calculo(3,  25.000);
	MetodosBase.calculo( MetodosBase.tresParcelas(), 1.000); //metodo passado como parametro
	
	
	
	
	
	
	
	
	
	}
}
