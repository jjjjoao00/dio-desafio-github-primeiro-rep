import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int quantidadeNumero;
    int contador = 0;
    int numero;
    Scanner scan = new Scanner(System.in);
    int quantidadePares = 0;
    int quantidadeImpares = 0;

    // informa quantidade de numeros a serem inseridos
    System.out.println("Quantidade de Numeros: ");
    quantidadeNumero = scan.nextInt();

    do {
      System.out.println("Numero: ");
      numero = scan.nextInt();

      // verificação de pares e impares
      if (numero % 2 == 0) {
        quantidadePares++;
      } else {
        quantidadeImpares++;
      }

      contador++;

    } while (contador < quantidadeNumero);

    System.out.println("Quantidade Par: " + quantidadePares + " Quantidade Ímpar: " + quantidadeImpares);

  }
}