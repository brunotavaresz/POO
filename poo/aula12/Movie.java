package aula12;

public class Movie{
	final String nome, genero, rating;
	final int tempo;
	double score;
	
	public Movie(String nome, double score, String rating, String genero, int tempo) {
		this.nome=nome;
		this.score=score;
		this.rating=rating;
		this.genero=genero;
		this.tempo=tempo;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public String getRating() {
		return rating;
	}

	public int getTempo() {
		return tempo;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Movie [nome=" + nome + ", genero=" + genero + ", rating=" + rating + ", tempo=" + tempo + ", score="
				+ score + "]";
	}	
	
	
	public static int compararNome(Movie a, Movie b) {
		return a.getNome().compareToIgnoreCase(b.getNome());
	}
	
	public static int compararScoreDescrescente(Movie a, Movie b) { 
		return Double.compare(b.getScore(), a.getScore()); 
	}
	
	public static int compararTempoCrescente(Movie a, Movie b) { 
		return a.getTempo()-b.getTempo(); 
	}

}