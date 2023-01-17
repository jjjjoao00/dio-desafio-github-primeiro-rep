package orientacaoObjetos;

public class Faxineiro extends Funcionario {
	//sobrescrita
	@Override
	void metodo1() {
		System.out.println("Todos são funcionários, e eu sou faxineiro");
	}
	@Override
	void metodo2() {
		System.out.println("Eu limpo esta empresa");
	}


}
