package tech.jiangtao.springmvc.exception;

/**
 * @class: CustomException </br>
 * @description: 自定义异常 </br>
 * @creator: kevin </br>
 * @email: jiangtao103cp@gmail.com </br>
 * @date: 2017/3/28 下午8:57</br>
 * @version: 0.0.1 </br>
 **/
public class CustomException extends Exception {

  private String message;

  public CustomException(String message){
    super(message);
    this.message = message;
  }

  @Override public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
