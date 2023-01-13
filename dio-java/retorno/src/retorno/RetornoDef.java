package retorno;

public class RetornoDef {

	public static double quaTriTra(double a) {
		 
		return a *a;
	}
	
	public static double quaTriTra(double b, double altura) {
		 
		return (b * altura)/2;
	}
	
	public  static double quaTriTra(double bMaior, double bMenor, double h) {
		 
		return ((bMaior + bMenor)*h)/2;
	}
	
	public  static float quaTriTra(float dEzao, float dEzinho) {
		
		return (dEzao * dEzinho) /2;
	}

}
