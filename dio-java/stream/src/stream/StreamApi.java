package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApi {

	public static void main(String[] args) {
		List<String> numerosAleatorios = Arrays.asList ("1", "0", "4", "1","2","3","9","9","6","5");
		
		System.out.println("Imprime todos os elementos dessa lista de String");
		numerosAleatorios.stream().forEach(s -> System.out.println(s)); //lambda (argumento) -> (corpo)

		
		System.out.println("5 primeiros numeros e colocar eles dentro de um Set");
		numerosAleatorios.stream();
							.limit(5);
			
		
	}

}
