package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class MetodoList {

	public static void main(String[] args) {
		//inicializar a implementação da list
		List<Double> notas = new ArrayList<>(); //inicialização da variavel com o metodo diamond
		notas.add(7d); //adcionando elementos na lista
		notas.add(7.5);
		notas.add(8.5);
		notas.add(0.5);
		notas.add(9.5);
		notas.add(3.5);
		notas.add(0.0);
		System.out.println(notas);//metodo para imprimir 1
		//System.out.println(notas.toString());//metodo para imprimir 2
		
		System.out.println("Exiba a posição da nota 8.5: "+ notas.indexOf(8.5)); //exibe a posição de um elemento na lista
		System.out.println("Adcione na lista a nota 6.5 na posição 4: "); //add um elemento a determinada posição
		notas.add(4, 6.5); //(posição int, elemento double)//add um elemento a determinada posição
		System.out.println(notas);
		
		System.out.println("substitua a nota 7.5 pela nota 9.32");
		notas.set(notas.indexOf(7d), 9.32); //substitui um elemento na lista // (posição do elemento a ser substituido, elemento a substituir)
		System.out.println(notas);
		
		System.out.println("Confira se a nota 7.0 está na lista: "+ notas.contains(9.32)); // confere se um elemento está na lista
		
		
		System.out.println("Exiba todas as notas na ordem em que foram informados: ");
		System.out.println(notas); //exibe as notas na ordem em que foram inseridas
		//for (double nota: notas) System.out.println(nota); // exibe as notas na ordem em que foram inseridas porém na vertical (uma em cima da outra)
		
		System.out.println("Exiba a terceira nota adcionada: " + notas.get(2)); //exibe um elemento a partir da inserção da sua posição
		
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas)); // imprime o menor elemento da lista
		System.out.println("Exiba a maior nota: " + Collections.max(notas)); // imprime o maior elemento da lista
		
		
		//soma dos valores da lista
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator(); 
		Double soma = 0d;
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		System.out.println("A soma é: " + soma);
		
		
		//media dos valores da lista
		System.out.println("Exiba a média das notas " + (soma/notas.size()));

		//remove elementos da lista
		System.out.println("Remova a nota 0.5: ");
		notas.remove(0.5d);
		System.out.println(notas);
		
		//remove elementos da lista a partir da posição
		System.out.println("Remova a nota da posição 4");
		notas.remove(4);
		System.out.println(notas);
		
		//remove elementos que são menores que outros  
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) {iterator1.remove();}
		}
		System.out.println(notas);
		
		//apagar toda a lista
		System.out.println("Apague a lista");
		notas.clear();
		System.out.println(notas);
		
		//System.out.println("Confira se a lista está vazia: "+notas.isEmpty()); // retorna boolean (True = vazia // False = não vazia
		
		

		
		
	
	}

}
