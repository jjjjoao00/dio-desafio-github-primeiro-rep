import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // criação do objeto scan
    Scanner scan = new Scanner(System.in);

    int nota;

    // laço
    while (true) {
      System.out.println("Digite uma Nota entre 0 e 10: ");
      nota = scan.nextInt();

      // para o laço se a nota for maior que 10 ou (||) menor que 0
      if (nota > 10 || nota < 0) {
        break;
      }
    }

  }
}