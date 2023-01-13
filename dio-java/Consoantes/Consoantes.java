import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //inicializando o array
    //array com 6 lugares a serem ocupados
    String[] array= new String[6];
    //controlador de quantidade de consoantes
    int quantidadeConsoantes =0;

    int contador=0;
    Scanner scan = new Scanner(System.in);

    //System.out.print("Digite 6 letras: ");
    //array = scan.next(); 

    do{
      //pedir para o usuario digitar as letras
      System.out.print("Digite uma letra: ");
      //guarda as letras em uma variavel local
      String letra = scan.next();
      
      //testa se as letras são vogais
      if (!(letra.equalsIgnoreCase("a") ||
          letra.equalsIgnoreCase("e") ||
          letra.equalsIgnoreCase("i") ||
          letra.equalsIgnoreCase("o") ||
          letra.equalsIgnoreCase("u") ) ) 
          {
            //adciona ao array as letras que sao inseridas limitadas pelo contador
            array[contador] = letra;
            quantidadeConsoantes++; }
      
      contador ++;
      
    }while(contador < array.length);
    
    //para cada elemento no array//faça tal coisa
    for (String consoante : array) 
    {
      //para ignoras as vogais
      if(consoante != null)
      {System.out.print(consoante + " ");}
     }

    System.out.println("\nQuantidade de Consoantes: "+quantidadeConsoantes);
    
  }
}
