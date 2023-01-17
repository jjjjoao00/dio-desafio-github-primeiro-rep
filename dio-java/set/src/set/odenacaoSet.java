package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class odenacaoSet {

	public static void main(String[] args) {
		//ordem aleatoria
		Set<Serie> minhasSeries = new HashSet<>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comedia", 25));
		}};
		
		for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() +" - " + serie.getTempoEpisodio());
		
		//ordem de inserção
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comedia", 25));
		}};
		
		for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() +" - " + serie.getTempoEpisodio());
		
		//de acordo com a ordem natural (tempo de episodio)
	 	Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
	 	for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + "  - " + serie.getTempoEpisodio());
	 	
	 	System.out.println(minhasSeries2);
	 	
	 	//ordem por nome/genero/tempo de episodio
	 	Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
	 	//adcionar collections em listas
	 	minhasSeries3.addAll(minhasSeries);
	 	for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + "  - " + serie.getTempoEpisodio());
	 	
	 	//System.out.println(minhasSeries3);
	 	

	}

}

//criação classe serie
class Serie implements Comparable <Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	//construtor
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome= nome;
		this.genero= genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	
	//metodos get 
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	@Override
	public String toString() {
		return "{" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "}";
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie serie = (Serie) obj;
		return Objects.equals(genero, serie.genero) && Objects.equals(nome, serie.nome)
				&& Objects.equals(tempoEpisodio, serie.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0) return tempoEpisodio;		

		int genero = this.getGenero().compareTo(serie.getGenero());
		return genero;
		
		
		
	}	
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie o1, Serie o2) {
		int nome =  o1.getNome().compareTo(o2.getNome());
		if (nome != 0) return nome;
		
		int genero =  o1.getGenero().compareTo(o2.getGenero());
		if (genero != 0) return genero;
		
		return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
	}
	
}
