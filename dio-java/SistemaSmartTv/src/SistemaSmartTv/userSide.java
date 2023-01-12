package SistemaSmartTv;

public class userSide {
	public static void main (String [] args) throws Exception{
		sistemaSmartTv sistemaSmartTv= new sistemaSmartTv();
		
		//printa o status inicial da smartTv
		//System.out.println("O Estado Inicial da Tv é: " + sistemaSmartTv.ligada); //inicial= false
		//System.out.println("O Canal Inicial é: " + sistemaSmartTv.canal); //inicial = 1
		//System.out.println("O Volume Inicial da Tv é: " + sistemaSmartTv.volume); //inicial = 25
		
		//printa o status alterado da smartTV
		
		//status ligado/desligado
		sistemaSmartTv.liga();
		//sistemaSmartTv.desliga();
		
		//volume aumenta +1
		//sistemaSmartTv.aumentaVolume();
		//volume diminui -1
		sistemaSmartTv.diminuiVolume();
		
		//muda canal +1
		//sistemaSmartTv.sobeCanal();
		
		//muda canal -1
		//sistemaSmartTv.diminuiCanal();
		
		//muda canal com inserção de um número especifico
		sistemaSmartTv.mudaCanal(45);
		
		
		System.out.println("O Estado Atual da Tv é: " + sistemaSmartTv.ligada); //inicial= false 
		System.out.println("O Canal Atual é: " + sistemaSmartTv.canal); //inicial = 1  
		System.out.println("O Volume Atual da Tv é: " + sistemaSmartTv.volume); //inicial = 25 
		
		
		
		
		
	};

}
