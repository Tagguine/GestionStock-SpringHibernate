package DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import util.HibernateUtil;

public class ArticlelImpBDD implements ArticleDAO{
	
	
	

public void init() throws ParseException {
		
		System.out.println("Bienvenu sur la nouvelle Application Base de Donnée");
		
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2018-08-11");
        

        System.out.println("date1 : " + sdf.format(date1));

Date actuelle = new Date();

String dat = sdf.format(actuelle);

        //Calendar cal1 = Calendar.getInstance();
        System.out.println("date2 : " + dat);
       
        Date datr = sdf.parse(dat);
        

        if (datr.after(date1)) {
            System.out.println("Date1 is after Date2");
        }

        if (datr.before(date1)) {
            System.out.println("Date1 is before Date2");
        }

        if (datr.equals(date1)) {
            System.out.println("Date1 is equal Date2");
        }
        
        String s1="2018-08-11";  
        String s2="2018-08-10";  
        String s3="me";  
        System.out.println(s1.compareTo(s2));  
       
    
	    }

	@Override
	public void addArticle(Article a) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	    session.save(a);
	    session.getTransaction().commit();
	}

	@Override
	public void deleteArticle(Long id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	    Article a = (Article)session.load(Article.class, id);
	    session.delete(a);
	    session.getTransaction().commit();
	}

	@Override
	public Article getArticle(Long id) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	    Article a =(Article)session.load(Article.class, id);
		return a;
	}

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	   
	    
		return session.createQuery("from Article").list();
	}

	@Override
	public void updateArticle(Article a) {
		// TODO Auto-generated method stub
		
	}

}
