package hello.servlet.web.frontcontrollerview2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.web.frontcontrollerview.Myview;

public class MemberFormControllerV2 implements ControllerV2{

	@Override
	public Myview process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;{
		return new Myview("/WEB-INF/views/new-form.jsp");
	}
}
