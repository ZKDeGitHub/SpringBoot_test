package com.javasm.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/11 16:55
 * @description: 自定义的拦截器，需要配合实现WebMvcConfigurer的配置类来使用基于SpringBoot的拦截器
 * WebMvcConfigurer接口的方法都是default修饰的，可以当做普通方法，因此其实现类不必重新所有方法，只重写自己需要的方法即可
 */

@Component
public class LoginInterceptor implements HandlerInterceptor {

    // 在目标方法执行之前执行 return true继续执行
    // return false 拦截下来,不再执行目标方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        return true;
    }

    // 在目标方法执行之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    // 在响应即将完成时执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}