package DAO;

import java.util.ArrayList;
import java.util.List;

public class ArticleImp implements ArticleDAO{

	private List<Article> article = new ArrayList<Article>();
	@Override
	public void addArticle(Article a) {
		// TODO Auto-generated method stub
		a.setIdArticle(new Long(article.size() + 1));
		article.add(a);
	}

	@Override
	public void deleteArticle(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article getArticle(Long id) {
		// TODO Auto-generated method stub
		return null;
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

}
