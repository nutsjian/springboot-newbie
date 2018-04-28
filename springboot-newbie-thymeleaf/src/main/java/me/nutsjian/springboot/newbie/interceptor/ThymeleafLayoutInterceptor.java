package me.nutsjian.springboot.newbie.interceptor;

import me.nutsjian.springboot.newbie.support.Layout;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThymeleafLayoutInterceptor extends AbstractHandlerInterceptor {


//    public void setDefaultLayout(String defaultLayout) {
//        Assert.hasLength(defaultLayout, "has length error");
//        this.defaultLayout = defaultLayout;
//    }
//
//    public void setViewAttributeName(String viewAttributeName) {
//        Assert.hasLength(defaultLayout, "has length error");
//        this.viewAttributeName = viewAttributeName;
//    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView == null || !modelAndView.hasView()) {
            return;
        }

        if (modelAndView.getStatus() == HttpStatus.NOT_FOUND || modelAndView.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR) {
            return;
        }

        String originalViewName = modelAndView.getViewName();
        if (isRedirectOrForward(originalViewName)) {
            return;
        }
        String layoutName = getLayoutName(handler);
        if (Layout.NONE.equals(layoutName)) {
            return;
        }
        modelAndView.setViewName(layoutName);
        modelAndView.addObject(this.viewAttributeName, originalViewName);
    }


}
