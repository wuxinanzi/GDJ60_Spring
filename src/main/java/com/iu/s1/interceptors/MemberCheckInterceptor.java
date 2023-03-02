package com.iu.s1.interceptors;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class MemberCheckInterceptor extends HandlerInterceptorAdapter{
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//Controller 진입전
		//return이 true라면 다음 Controller로 진행
		//return이 true라면 다음 Controller로 진행 X
		System.out.println("Member Check Interceptor");
		/* response.sendRedirect(""); */
		
		Object obj = request.getSession().getAttribute("member");
		if(obj != null) {
			return true;
		}
		
		//1. Foward Jsp
		/*
		 * System.out.println("로그인 안한 경우"); request.setAttribute("result", "권한이 없습니다.");
		 * request.setAttribute("url", "../member/memberLogin"); RequestDispatcher view
		 * = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
		 * view.forward(request, response);
		 */
		//2. Redirect
		/* response.sendRedirect("../../../../../member/meberLogin.jsp"); */
		return false;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		//Controller에서 리턴 후 DS 전
		System.out.println("Controller에 리턴 후 DS 진입 전");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		// JSP 랜더링 후
		System.out.println("JSP 렌더링 후");
	}
	
}
