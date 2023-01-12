class Main {
  public static void main(String[] args) {
    //inicializando o array unidimensional (uma linha e varias colunas)
    int[] vetor = {1, 2, 3 ,4,5,6};
    int contador = 0;

    System.out.print("Vetor: ");

    //mostrar os elementos do array
    while(contador < (vetor.length)){
      //mostrar os elementos do vetor
      System.out.print(vetor[contador] + " ");
      contador ++;
      }

    System.out.print("\nVetor: ");
    //ordem inversa
    for(int i = (vetor.length-1); i>=0; i-- ){
      System.out.print(vetor[i] + " ");
    }
  }
}