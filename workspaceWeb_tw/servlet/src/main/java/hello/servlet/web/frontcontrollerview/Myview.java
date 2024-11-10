package hello.servlet.web.frontcontrollerview;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myview {
	
	private String viewPath;

	public Myview(String viewPath) {	
		this.viewPath = viewPath;
	}
	
	void render(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;{
		RequestDispatcher dispatcher = request.getRequesDispatcher(viewPath);
		dispatcher.forward(request, response);
		
	}
}
