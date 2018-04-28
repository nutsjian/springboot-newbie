package me.nutsjian.springboot.newbie.interceptor;

import me.nutsjian.springboot.newbie.annotation.Layout;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

abstract class AbstractHandlerInterceptor implements HandlerInterceptor {
    private static final String DEFAULT_LAYOUT = "layouts/default";
    private static final String DEFAULT_VIEW_ATTRIBUTE_NAME = "view";

    private String defaultLayout = DEFAULT_LAYOUT;
    String viewAttributeName = DEFAULT_VIEW_ATTRIBUTE_NAME;

    boolean isRedirectOrForward(String viewName) {
        return viewName.startsWith("redirect:") || viewName.startsWith("forward:");
    }

    String getLayoutName(Object handler) {
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Layout layout = getMethodOrTypeAnnotation(handlerMethod);
            if (layout != null) {
                return layout.value();
            }
        }
        return this.defaultLayout;
    }

    private Layout getMethodOrTypeAnnotation(HandlerMethod handlerMethod) {
        Layout layout = handlerMethod.getMethodAnnotation(Layout.class);
        if (layout == null) {
            return handlerMethod.getBeanType().getAnnotation(Layout.class);
        }
        return layout;
    }
}
