package mediaTemperatura;

public class Meses {
	private String mes;
	private Double media;
	
	
	public Meses(String mes, Double media) {
		this.mes = mes;
		this.media = media;		
	}
	
	public String getMes() {
		return mes;
	}
	
	public Double getMedia() {
		return media;
	}
	
	@Override
	public String toString() {
		return "{" + "Mes -'" + mes + '\'' + ", Média=" + media + '\'' + '}';
		
	}

}
