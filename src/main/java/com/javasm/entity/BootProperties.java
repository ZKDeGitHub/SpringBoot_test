package com.javasm.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/11 11:42
 * @description:
 */
@Component
@Data
@ConfigurationProperties(prefix = "boot") //声明配置文件从boot开始读取
public class BootProperties {
   //与yml中key一致
   private String root;
   private Double mydouble;
   private Date mydate;
   private List<String> mystrList;
   private List<String> mystrList2;
   private Map<String,Integer> mymap;
   //封装内部类，多层key
   @Resource
   private LoginToken loginToken;
   @Resource
   private MyCors myCors;


   @Data
   @Component
   class MyCors {
      private String path;
      private List<String> allowedOrigins;
      private List<String> allowedHeaders;
      private List<String> allowedMethods;
      private Boolean allowCredentials;
      private Long maxAge;
      private List<String> exposedHeaders;
   }
}
