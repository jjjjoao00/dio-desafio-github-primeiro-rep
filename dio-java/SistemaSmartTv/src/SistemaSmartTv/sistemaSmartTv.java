package SistemaSmartTv;

public class sistemaSmartTv {
	//status inicial da smartTV
	boolean ligada= false;
	int canal = 1;
	int volume= 25;
	
	
	//altera o estado de liga/desliga da smartTV
	public void liga() {
		ligada = true;
	}
	
	public void desliga() {
		ligada = false;
	}
	
	//Aumenta/Diminui o volume em +1/-1
	
	public void aumentaVolume () {
		volume ++; //incrementa o volume em +1
	}
	
	public void diminuiVolume() {
		volume --; //decrementa o volume em -1
	}
	
	//muda canal em +1/-1
	
	public void sobeCanal() {
		canal ++;
	}
	
	public void diminuiCanal() {
		canal --;
	}
	
	//muda canal com inserção de um número específico
	
	public void mudaCanal(int novoCanal) {
		canal = novoCanal;
	}
	

}
