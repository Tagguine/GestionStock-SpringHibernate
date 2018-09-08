package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import SERVICE.ArticleMetie;

@Controller
public class ArticleController {
	
	@Autowired
	ArticleMetie metie;
	
	// index.aspx
		@RequestMapping("/index")
		public String pageIndex(){
			
			return "article";
			//   /Pages/article.jsp
		}

}
