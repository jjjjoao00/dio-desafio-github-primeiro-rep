package orientacaoObjetos;

public class Carro extends Veiculo {
	String cor; //atributo
	String modelo; //atributo
	double capacidadeTanque; //atributo

	//construtor
	Carro (){ }
	
	//sobrecarga do construtor
		Carro(String cor, String modelo, double capacidadeTanque ){
			this.cor = cor;
			this.modelo = modelo;
			this.capacidadeTanque = capacidadeTanque;			
		}
		
		
		void setCor(String cor) {
			this.cor = cor; //this diferencia atributos de parametros de metodos
		}
		
		String getCor() {
			return cor;
			
		}
		
		void setModelo (String modelo) {
			this.modelo = modelo;
		}
		
		String getModelo () {
			return modelo;
		}
		
		void setCapacidadeTanque(double capacidadeTanque) {
			this.capacidadeTanque = capacidadeTanque;
		}
		
		double getCapacidadeTanque() {
			return capacidadeTanque;
		}
		
		double totalValorGasolina(double valorGasolina) {
			return capacidadeTanque * valorGasolina;
			
		}
		
		
	}
	


