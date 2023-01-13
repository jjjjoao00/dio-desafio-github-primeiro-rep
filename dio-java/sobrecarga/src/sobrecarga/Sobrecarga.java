package sobrecarga;

public class Sobrecarga {
	
	public static void quaTriTra(double a) {
		double areaQua = a *a;
		System.out.println("A Área do quadrado é: " + areaQua);
	}
	
	public static void quaTriTra(double b, double altura) {
		double areaTri = (b * altura)/2;
		System.out.println("A Área do triangulo é: " + areaTri);
	}
	
	public  static void quaTriTra(double bMaior, double bMenor, double h) {
		double areaTra = ((bMaior + bMenor)*h)/2;
		System.out.println("A Área do trapézio é: " + areaTra);
	}
	
	public  static void quaTriTra(float dEzao, float dEzinho) {
		double areaLo = (dEzao * dEzinho) /2;
		System.out.println("A Área do Losango é: " + areaLo);
	}
	

}
