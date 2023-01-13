package retorno;



public class RetornoMetodo {

	public static void main(String[] args) {
		double trapezio = RetornoDef.quaTriTra(2 , 2 , 2);
		System.out.println(trapezio);
		double quadrado = RetornoDef.quaTriTra(2);
		System.out.println(quadrado);
		double triangulo = RetornoDef.quaTriTra(2d, 2d);
		System.out.println(triangulo);
		double losango = RetornoDef.quaTriTra(5f, 2f);
		System.out.println(losango);

	}

}
