package map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExMap {
	public static void main (String[] args) {
		//criação de dicionario
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			//nao da pra usar add() no map
			put("gol", 14.4); //put(chave, valor)
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		
		
		//substituir valores
		carrosPopulares.put("gol", 15.2);
		
		System.out.println(carrosPopulares);
		
		//conferir se um elemento esta no dicionario
		System.out.println("Contem o elemento tucson?: " + carrosPopulares.containsKey("tucson"));
		
		//exibir um value
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
		
		//exibir as keys
		System.out.println(carrosPopulares.keySet());
		
		//exibir os values
		System.out.println(carrosPopulares.values());
		
		//maior valor do dicionario
		Double consumoEficiente = Collections.max(carrosPopulares.values());
		
		//separar chave de valor
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		
		//variavel de controle
		String modeloEficiente = "";
		
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(consumoEficiente))
				modeloEficiente = entry.getKey();
		}
		
		System.out.println("Modelo mais eficiente: " + modeloEficiente + " - " + consumoEficiente);
		
		//modelo menos eficiente
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		//retorna um set com chaves e valores manipulaveis separadamente
		
		String modeloMenosEficiente = "";
		
		for(Map.Entry<String, Double> entry:  carrosPopulares.entrySet()) {
			if(entry.getValue().equals(consumoMenosEficiente)) modeloMenosEficiente = entry.getKey();	
			System.out.println("Modelo menos eficiente: "+ modeloMenosEficiente + " - "+ consumoMenosEficiente);
			
		}
		
		//soma de values
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		
		//média
		System.out.println(soma/carrosPopulares.size());
		
		//remover elementos com parametros
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		
		if (iterator1.next().equals(15.6)) iterator1.remove();
		
		//mostrar na ordem em que foram inseridos
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>()
		{{
			//nao da pra usar add() no map
			put("gol", 14.4); //put(chave, valor)
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares1);
		
		//ordenação pela chave
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);
		
		//apagar o dicionario
		carrosPopulares.clear();
		System.out.println("O Dicionario esta vazio?: "+ carrosPopulares.isEmpty());
 		
		
		
		
		
 }
	
}
