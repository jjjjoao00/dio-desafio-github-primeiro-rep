package operadoresLogicos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
	
	//inicialização das variaveis
	
	boolean b1 = true;
	boolean b2 = false;
	boolean b3 = true;
	boolean b4 = false;
	int i1 =10;
	int i2 = 20;
	float f1 = 2.5f;
	float f2 = 5.0f;
	
	double salarioMensal = 11093.583d;
	double mediaSalarial = 5000d;
	int quantidadeDependentes = 1;
	int mediaDependentes = 2;
	boolean salarioBaixo = salarioMensal < mediaSalarial;
	boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
	
	
	boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
	if(recebeAuxilio) {
		System.out.println("Recebe Auxilio");
	}else {
		System.out.println ("Não Recebe Auxilio");
	}
	
	
	//operações
	
	//conjunção (&&)
	System.out.println(b1 && b2);
	System.out.println(b1 && b3);
	
	//disjunção (||)
	System.out.println(b2 || b3 );
	System.out.println(b2 || b4);
	
	//disjunção excluisiva (^)
	System.out.println(b1 ^ b3);
	System.out.println(b4 ^ b1);
	
	//negação (!)
	System.out.println(!b1);
	System.out.println(!b2);
	
	//negação (!) com maior que (>) com disunção (||) com menor que (<)
	System.out.println((i1>i2) || (f2<f1));
	
	//negação (!) adição (+) menor que (<) subtração (-) conjunção (&&) boolean (true)
	System.out.println( ((i1+i2)<(f2-f1))&&true );
	
	}
	
	

}
