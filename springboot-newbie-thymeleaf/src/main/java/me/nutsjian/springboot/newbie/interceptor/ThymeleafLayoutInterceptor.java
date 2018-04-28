package me.nutsjian.springboot.newbie.interceptor;

import me.nutsjian.springboot.newbie.annotation.Layout;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 该拦截器主要用于拦截 Controller 进入方法的时候，去检查方法上的 @Layout 注解
 *
 * 根据 Layout 注解，判断该 view 返回对应使用哪个 thyemleaf 的 layout 布局文件，布局文件对应在 classpath:templates/layouts 中
 *
 * 其中，@Layout 注解可以指定使用哪个布局文件，通过 value 指定，比如 @Layout(value = "layouts/simple")，就使用 classpath:templates/layouts/simple.html 布局文件
 *
 * 另外需要注意的是，每次返回都会携带一个 view 的参数返回，这个 view 就是 ModelAndView 中设置的 Object，用于指定返回的页面名称，比如 layout_demo/basic，那么我们可以查看 /layouts/default.html
 * 中的这句代码 <div th:replace="${view} :: content" th:class="default-content">Content goes here!</div> ，就会被替换成
 *
 * <div th:replace="layout_demo/basic :: content" th:class="default-content">Content goes here!</div> 这样就完成了从 layout_demo/basic 中查找 fragment="content" 的内容替换掉这里的内容。
 */
public class ThymeleafLayoutInterceptor extends AbstractHandlerInterceptor {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 如果是 ajax 请求 或者 ModelAndView 中没有设置模板视图则直接返回，不拦截
        if (modelAndView == null || !modelAndView.hasView()) {
            return;
        }

        // 这里可以看 ErrorHandlerInterceptor 中已经处理了 ModelAndView 中的 Status 变量，所以这里可以通过简单判断逻辑
        if (modelAndView.getStatus() == HttpStatus.NOT_FOUND || modelAndView.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR) {
            return;
        }

        // 如果是重定向或转发则直接返回
        String originalViewName = modelAndView.getViewName();
        if (isRedirectOrForward(originalViewName)) {
            return;
        }

        // 这里去判断方法上的 @Layout 注解，即注解中使用的 Layout 的布局模板文件
        String layoutName = getLayoutName(handler);
        if (Layout.NONE.equals(layoutName)) {
            // 若是空布局，则直接返回
            return;
        }
        // 否则设置返回的 viewName 为指定的布局模板文件 templates/layouts/xxx.html
        modelAndView.setViewName(layoutName);
        // 与此同时，我们还要把布局文件中真正的 content 内容的 fragment html 找到，所以需要设置返回变量 view = 原来 controller 中 return 的 viewName
        modelAndView.addObject(this.viewAttributeName, originalViewName);
    }


}
