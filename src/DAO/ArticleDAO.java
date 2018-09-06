package DAO;

import java.util.List;

public interface ArticleDAO {

	public void addArticle(Article a);
	public void deleteArticle(Long id);
	public Article getArticle(Long id);
	public List<Article> getAllArticles();
	public void updateArticle(Article a);
	
	
}
