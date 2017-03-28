package tech.jiangtao.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @class: HandlerInterceptor1 </br>
 * @description:  拦截器二</br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/28 下午10:52</br>
 * @version: 0.0.1 </br>
 **/
public class HandlerInterceptor2 implements HandlerInterceptor{

  /**
   * 执行handler之前执行，用于初始化数据
   * 用于用户认证，权限校验
   * @param httpServletRequest
   * @param httpServletResponse
   * @param o
   * @return
   * @throws Exception
   */
  @Override public boolean preHandle(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse, Object o) throws Exception {
    return false;
  }

  /**
   * 在执行handler，返回ModelAndView之前执行
   * 提供一些公用数据和视图信息
   * @param httpServletRequest
   * @param httpServletResponse
   * @param o
   * @param modelAndView
   * @throws Exception
   */
  @Override public void postHandle(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)
      throws Exception {

  }

  /**
   *  执行handler之后执行
   *  可以做系统的统一异常处理
   *  进行方法的执行性能监控,
   *  实现统一的日志记录
   * @param httpServletRequest
   * @param httpServletResponse
   * @param o
   * @param e
   * @throws Exception
   */
  @Override public void afterCompletion(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

  }
}
