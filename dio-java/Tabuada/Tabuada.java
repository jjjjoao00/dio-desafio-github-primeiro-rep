import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int tabuada;

    System.out.println("Digite um numero para Multiplicar: ");
    tabuada = scan.nextInt();

    // for(contador ; limite; incremento){}
    for (int i = 1; i <= 10; i++) {
      System.out.println(tabuada + "X" + i + "=" + (tabuada * i));

    }

  }
}