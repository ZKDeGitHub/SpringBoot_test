package com.javasm.config;

import com.javasm.interceptor.LoginInterceptor;
import com.javasm.interceptor.SecondInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/11 20:54
 * @description: WebMvcConfigurer的实现类，此处重写拦截器配置，配置要拦截的和不拦截的路径
 * 跨域问题解决方案二：定义类,实现WebMvcConfigurer接口,重写addCorsMapping方法
 */

@Configuration
public class MyMvcConfigurer implements WebMvcConfigurer {

   @Resource
   private LoginInterceptor loginInterceptor;

   @Resource
   private SecondInterceptor secondInterceptor;

   /**
    * 跨域问题解决方案二：定义类,实现WebMvcConfigurer接口,重写addCorsMapping方法
    * @param registry
    */
   @Override
   public void addCorsMappings(CorsRegistry registry) {
     /* //允许的请求路径
      registry.addMapping("/**")
      // 允许的域名
      .allowedOrigins("http://localhost:5173")
      // 允许的方法
      .allowedMethods("*")
      // 允许的请求头
      .allowedHeaders("*")
      // 不允许的请求头
      .exposedHeaders("token")
      // 是否允许携带cookie
      .allowCredentials(true);
*/
   }

   /**
    * 配置 自定义的拦截器
    * @param registry
    */
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      // 参数:拦截器的对象
      registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/test/findAll");
      // 如果有第二个拦截器可以继续配置
      registry.addInterceptor(secondInterceptor).addPathPatterns("/**");
   }
}
