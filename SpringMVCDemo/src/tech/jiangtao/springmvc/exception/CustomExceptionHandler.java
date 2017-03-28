package tech.jiangtao.springmvc.exception;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @class: CustomExceptionHandler </br>
 * @description: 自定义异常处理器 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/28 下午9:03</br>
 * @version: 0.0.1 </br>
 * 这是什么jb处理器
 **/
public class CustomExceptionHandler implements HandlerExceptionResolver {

  // 如果是移动端应该怎么处理
  // handler最终是一个HandlerMethod
  @Override public ModelAndView resolveException(HttpServletRequest request,
      HttpServletResponse response, Object handler, Exception e) {
    // 进行输出
    e.printStackTrace();
    // 统一的异常处理代码,根据不同的异常类型进行异常处理
    //  系统自定义的异常CustomException,手动抛出，手动处理
    // 非自定义的异常,我们可以重新构造成自定义异常CustomException.
    String message = null;
    CustomException exception = null;
    if (e instanceof CustomException){
      exception = (CustomException) e;
    }else {
      exception = new CustomException(e.getMessage());
    }
    message = exception.getMessage();
    request.setAttribute("message",message);
    try {
      request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request,response);
    } catch (ServletException | IOException e1) {
      e1.printStackTrace();
    }
    return null;
  }
}
