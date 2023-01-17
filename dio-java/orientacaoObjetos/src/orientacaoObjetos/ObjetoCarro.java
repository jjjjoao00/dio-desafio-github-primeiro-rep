package orientacaoObjetos;

public class ObjetoCarro {

	public static void main(String[] args) {
		
		//criação do objeto carro1
		Carro carro1 = new Carro();
		
		//setagem do objeto carro por atributo
		carro1.setCor("Azul");
		carro1.setModelo("Celta");
		carro1.setCapacidadeTanque(24.2);
		
		
		//mensagem
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorGasolina(6.58));
		
		//criação do objeto carro e setagem do objeto carro por sobrecarga do construtor
		Carro carro2= new Carro("Vermelho", "RAM", 93.0);
		
		
		//mensagem
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorGasolina(6.58));
		

	}

}
