package SERVICE;

import java.util.List;

import DAO.Article;

public interface ArticleMetie {
	
	public void addArticle(Article a);
	public void deleteArticle(Long id);
	public Article getArticle(Long id);
	public List<Article> getAllArticles();
	public void updateArticle(Article a);

}
