package orientacaoObjetos;

public class FuncionarioGerenteFaxineiroVendedor {

	public static void main(String[] args) {
		//criação de objeto
		//Funcionario funcionario = new Funcionario();
		
		//upcast
//		classe mae  variavel       classe filha
		/*Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		Funcionario gerente = new Gerente ();*/
		
		//polimorfismo // utilizando a classe mãe tem a possibilidade de haver polimorfismo
		Funcionario[] funcionarios = new Funcionario[] {new Vendedor(), new Faxineiro(), new Funcionario()
	};
		
		for (Funcionario func: funcionarios) {
			func.metodo1();
		}
		
		System.out.println("");
		
		for (Funcionario func: funcionarios) {
			func.metodo1();
			
		}
		
		System.out.println("");
		
		
		//sobrescrita // diretamente no tipo é sobrescrita
		Faxineiro faxineiro = new Faxineiro();
		faxineiro.metodo2();
		
		
		
		

	}

}
