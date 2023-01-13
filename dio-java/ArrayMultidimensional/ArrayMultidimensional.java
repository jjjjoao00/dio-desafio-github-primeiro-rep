import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random random = new Random();

    //int[linhas][colunas]
    int[][] M = new int [4][4];

    //preenchendo as linhas(i) e colunas(j)
    for(int i = 0; i < M.length; i++){
      for(int j = 0; j < M[i].length; j++){
        M[i][j] = random.nextInt(9);
      }
    
      
    }

    for(int[] linha : M){
      for(int elementoDaColuna : linha){
        System.out.print(elementoDaColuna + " ");
      }
      System.out.println();
    }
  }
}