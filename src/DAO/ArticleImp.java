package DAO;

import java.util.ArrayList;
import java.util.List;

public class ArticleImp implements ArticleDAO{

	private List<Article> article = new ArrayList<Article>();
	
	public void init(){
		System.out.println("ça marche");
	}
	
	@Override
	public void addArticle(Article a) {
		// TODO Auto-generated method stub
		a.setIdArticle(new Long(article.size() + 1));
		article.add(a);
	}

	@Override
	public void deleteArticle(Long id) {
		// TODO Auto-generated method stub
		for(Article a:article) {
			if(a.getIdArticle().equals(id)) {
				article.remove(a);
			}
		}
	}

	@Override
	public Article getArticle(Long id) {
		// TODO Auto-generated method stub
		Article art = null;
		for(Article a:article) {
			if(a.getIdArticle().equals(id)) {
				art = a;
				break;
			}
		}
	
		
		return art;
	}

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateArticle(Article a) {
		// TODO Auto-generated method stub
		
	}

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

}
