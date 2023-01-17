package set;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class SetExemplo {

	public static void main(String[] args) {
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5,9.3,5d,7d,0d,3.6)); 
		//set não trabalha com posição 
		
		//conferir se o conjunto contem tal elemento
		System.out.println("Confira se a nota 5 está no conjunto: "+ notas.contains(5d));
		
		//exibir o menor elemento
		System.out.println("Exiba o menor elemento: " + Collections.min(notas));
		
		System.out.println("Maior elemento: " + Collections.max(notas)); 
		
		
		//soma dos valores // elementos repetidos representam apenas 1 elementos
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Soma dos valores: " + soma);
		
		System.out.println("Média: "+(soma/notas.size()));
		
		//remover elementos
		System.out.println("Remover a nota 0");
		notas.remove(0d);
		System.out.println(notas);
		
		//remover elementos menores que outros e exibir
		Iterator<Double> iterator1 = notas.iterator();
		
		while (iterator1.hasNext()) {
			Double next = iterator.next();
			if (next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		//informar os elementos na ordem que foram inseridas
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		
		System.out.println(notas2);
		
		
		//elementos na ordem crescente
		Set<Double> notas3=new TreeSet<>(notas2);
		
		//apagar o conjunto
		notas.clear();
		
		
		
		
		
		
		

	}

}
