
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // entrada de dados // criação do objeto Scanner
    Scanner scan = new Scanner(System.in);

    // variaveis para a entrada dos dados
    String nome;
    int idade;

    /*
     * inserção e leitura de dados pelo programa
     * System.out.println("Nome: ");
     * // método next retorna string por padrão
     * nome = scan.next();
     * System.out.println("Idade: ");
     * // para retornar outro tipo de dado tem que inserir o tipo no comando
     * idade = scan.nextInt();
     */

    // while precisa de uma condição booleana
    while (true) {
      System.out.println("Nome: ");
      nome = scan.next();
      // equals compara strings // break interrompeo laço conforme condição estipulada
      if (nome.equals("0"))
        break;

      System.out.println("Idade: ");
      idade = scan.nextInt();

    }

  }

}