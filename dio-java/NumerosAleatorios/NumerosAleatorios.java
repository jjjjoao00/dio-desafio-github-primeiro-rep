import java.util.Random;

class Main {
  public static void main(String[] args) {
    // chamada da classe random (gera numeros aleatorios)
    Random random = new Random();
    // cria o array pra guardar os numeros aleatorios
    int[] numerosAleatorios = new int[20];

    // laço para o array de 20 numeros

    for (int i = 0; i < numerosAleatorios.length; i++) {
      // variavel local para guardar os valores do array
      int numero = random.nextInt(100);
      // bound coloca o limite para a inserção (numero de 0 a 100)

      // numerosAleatorios na posição i recebe o valor da variavel local numero
      numerosAleatorios[i] = numero;

    }

    // for each é bom pra outputs
    System.out.print("numeros aleatorios: ");
    for (int numero : numerosAleatorios) {
      System.out.println(numero + " ");
    }

    System.out.print("\nsucessores dos numeros aleatorios: ");
    // sucessor dos numeros aleatorios
    for (int numero : numerosAleatorios) {
      System.out.println((numero + 1));
    }

  }
}