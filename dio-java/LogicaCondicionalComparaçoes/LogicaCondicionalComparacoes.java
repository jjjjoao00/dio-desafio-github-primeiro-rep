class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!"); 
    // inicialização das variaveis 
    
    int i1 = 10;
    int i2 = 20;
    float f1 = 4.5f;
    float f2 = 3.5f;
    char c1 = 'x';
    char c2 = 'y';
    String s1 = "Fulano";
    String s2 = "Fulano";
    boolean b1 = true;
    boolean b2 = false;

    //comparação inteiros
    System.out.println (i1 == i1);
    System.out.println (i1 != i2);
    System.out.println(i1 > i2);
    System.out.println(i1 <= i2);

    //comparação floats
    System.out.println(f1 == f2);
    System.out.println(f1 != f2);
    System.out.println(f1 >= f2);
    System.out.println(f1 < f2);

    //comparação char
    System.out.println(c1 == c2);
    System.out.println(c1 != c2);
    System.out.println(c1 > c2);
    System.out.println(c1 <= c2);

    //comparação string
    System.out.println(s1 == s2);
    System.out.println(s1 != s2);

    //comparação boolean
    System.out.println(b1 == b2);
    System.out.println(b1 != b2);

    //comparação inteiro com float
    System.out.println(i2 > f1);
  }
}