package collections;
import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ListExemplo extends MetodoList {

	public static void main(String[] args) {
		List<Double> notas2 = new LinkedList<>();
		notas2.add(7d); //adcionando elementos na lista
		notas2.add(7.5);
		notas2.add(8.5);
		notas2.add(0.5);
		notas2.add(9.5);
		notas2.add(3.5);
		notas2.add(0.0);
		
		System.out.println("Mostre o primeiro elemento da lista sem removê-lo: ");
		System.out.println("O primeiro elemento é: "+ notas2.get(0));
		
		System.out.println("Mostre o primeiro elemento da lista removendo-o: ");
		Iterator<Double> iterator = notas2.iterator();
		while (iterator.hasNext()) {
				Double next = iterator.next();
					if(next != 7) {iterator.remove();
					System.out.println(notas2);
		}
					//System.out.println(notas2);
		

	}

}
	
}
