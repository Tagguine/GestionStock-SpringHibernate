package SERVICE;

import java.util.List;

import DAO.Article;
import DAO.ArticleDAO;

public class ArticleImpMetie implements ArticleMetie {

	private ArticleDAO dao;
	
	@Override
	public void addArticle(Article a) {
		// TODO Auto-generated method stub
dao.addArticle(a);
	}

	@Override
	public void deleteArticle(Long id) {
		// TODO Auto-generated method stub

	dao.deleteArticle(id);
	}

	@Override
	public Article getArticle(Long id) {
		// TODO Auto-generated method stub
		return dao.getArticle(id);
	}

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return dao.getAllArticles();
	}

	@Override
	public void updateArticle(Article a) {
		// TODO Auto-generated method stub

	}

	public ArticleDAO getDao() {
		return dao;
	}

	public void setDao(ArticleDAO dao) {
		this.dao = dao;
	}

}
