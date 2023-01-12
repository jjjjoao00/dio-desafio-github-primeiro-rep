import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int numero;
    int maior = 0; //variavel que armazena o maior numero digitado
    int soma = 0;
    int media;

    
    Scanner scan = new Scanner(System.in);

    //contador para as perguntas
    int contagem = 0;
    
    do{
      
      System.out.println("Numero: ");
      numero = scan.nextInt(); 

      //soma dos numero digitados
      soma = soma + numero;

      //media dos numeros digitados
      media = soma / 5;
      

        //se o numero digitador for maior que o valor da variavel "maior", a variavel "maior" vai armazenar o valor digitado em "numero"
        if (numero > maior){         
          maior = numero;
          }
      
      contagem ++; //incrementa em 1 unidade o contador
    }while(contagem < 5); //o laço repete enquanto o contador for menor que 5

    System.out.println("Maior: " + maior + " Média: " + media); //só imprime quando o laço terminar // fora do laço, se tivesse dentro do laço ele imprimiria o maior a cada iteração
  
    
  }
}