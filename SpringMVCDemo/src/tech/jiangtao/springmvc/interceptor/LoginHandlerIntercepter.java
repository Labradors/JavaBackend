package tech.jiangtao.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @class: LoginHandlerIntercepter </br>
 * @description: 认证访问拦截器 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/28 下午11:34</br>
 * @version: 0.0.1 </br>
 **/
public class LoginHandlerIntercepter implements HandlerInterceptor {

  @Override public boolean preHandle(HttpServletRequest request,
      HttpServletResponse response, Object o) throws Exception {
      if (request.getParameter("username")!=null){
        return true;
      }
      response.setCharacterEncoding("UTF-8");
      response.getOutputStream().print("{'error':'请前往登录页面'}");
    return false;
  }

  @Override public void postHandle(HttpServletRequest request,
      HttpServletResponse response, Object o, ModelAndView modelAndView)
      throws Exception {

  }

  @Override public void afterCompletion(HttpServletRequest request,
      HttpServletResponse response, Object o, Exception e) throws Exception {

  }
}
