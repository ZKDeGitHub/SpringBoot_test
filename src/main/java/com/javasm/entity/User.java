package com.javasm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/12 14:32
 * @description: springboot集成mybatis实验用实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private long id;
   private String userName;
   //    与MVC是一样的
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
   private LocalDateTime birthday;
   private String gender;
   private String address;
}
