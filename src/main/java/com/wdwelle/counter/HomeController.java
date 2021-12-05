package com.wdwelle.counter;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		if (session.getAttribute("count") == null) {
			Counter count1 = new Counter();
			return "index.jsp";
		}
		else {
			session.setAttribute("count", 1);
			return "index.jsp";
		}
	}
	@RequestMapping("/count")
	public String counter(HttpSession session) {
		return "count.jsp";
	}
}
