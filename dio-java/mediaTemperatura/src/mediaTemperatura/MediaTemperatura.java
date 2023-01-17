package mediaTemperatura;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class MediaTemperatura {

	public static void main(String[] args) {
		List<Double> temperaturaMedia = new ArrayList<>();
		
		temperaturaMedia.add(30d);
		temperaturaMedia.add(32d);
		temperaturaMedia.add(29d);
		temperaturaMedia.add(32d);
		temperaturaMedia.add(33d);
		temperaturaMedia.add(39d);
		
		System.out.println(temperaturaMedia);
		
		List<String> meses = new ArrayList<>();
		meses.add("Janeiro");
		meses.add("Fevereiro");
		meses.add("Março");
		meses.add("Abril");
		meses.add("Maio");
		meses.add("Junho");
		System.out.println(meses);
		
		
		//media das temperaturas
		Iterator<Double> iterator = temperaturaMedia.iterator();
		Double somaTemperaturas = 0d;
		while (iterator.hasNext()) {
			double next = iterator.next();
			somaTemperaturas += next;
			
		}
		System.out.println("A Média das temperaturas dos últimos 6 meses é: "+ (somaTemperaturas/temperaturaMedia.size()));
		
		//exibe as temperaturas acima da media
		Iterator <Double> iterator1 = temperaturaMedia.iterator();
		while (iterator1.hasNext()){
			Double next = iterator1.next();
				if (next < 32.5) {iterator1.remove();}
		}
		System.out.println("As maiores médias foram: "+temperaturaMedia);
		
		//exibe as temperaturas acima da media e os meses em que ocorreram
		System.out.print(meses.get(4) + " e " + meses.get(5));
		
		

	}

}


