package DAO;

public class Article {
	
	private Long idArticle;
	private String nom;
	private String description;
	private Double prix;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String nom, String description, Double prix) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}
	public Long getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
	

}
