package lab0;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Integer id;
	private Integer likes;
	private double nota;
    private ArrayList <Comentario> list_comments = new ArrayList<Comentario>();	

    public Disciplina(String nome, int id, int likes, double nota) {
		this.nome = nome;
		this.id = id;
		this.likes = likes;
		this.nota = nota;
	}

    public String getNome() {
		return nome;
	}

    public void setNome(String nome) {
		this.nome = nome;
	}

    public int getId() {
		return id;
	}

    public void setId(int id) {
		this.id = id;
	}

    public int getLikes() {
		return likes;
	}

    public void setLikes(int likes) {
		this.likes = likes;
	}

    public double getNota() {
		return nota;
	}

    public void setNota(double nota) {
		this.nota = nota;
	}

    public String getComment() {
		String text = "";
		
		for (Comentario comments : list_comments) {
			text += comments.toString() + "\n";
		}
		return text;
	}

	public void addComentario(Comentario _comments) {
		list_comments.add(_comments);
	}
	
	
	
	public String toString() {
		return "Disciplina: " + this.nome + "(" + this.id + ") - " + "Likes: " + this.likes + ", " + "nota: " + this.nota;
	}


}