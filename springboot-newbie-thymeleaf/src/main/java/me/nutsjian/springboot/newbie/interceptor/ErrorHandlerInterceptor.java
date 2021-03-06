package me.nutsjian.springboot.newbie.interceptor;

import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandlerInterceptor extends AbstractHandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 在请求处理之前调用，（Controller 方法调用之前）
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        // 如果是 Ajax 请求，modelAndView 为空
        if (modelAndView == null || !modelAndView.hasView()) {
            return;
        }

        // 如果response == 500，则设置返回的视图是 error/500，即对应的模板是 templates/error/500.html
        // 下面同理
        if (response.getStatus() == 500) {
            modelAndView.setViewName("error/500");
            modelAndView.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        } else if (response.getStatus() == 404) {
            modelAndView.setViewName("error/404");
            modelAndView.setStatus(HttpStatus.NOT_FOUND);
        }
    }
}
