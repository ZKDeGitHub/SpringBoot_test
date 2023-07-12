package com.javasm.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/11 15:22
 * @description:
 */
@Data
@Component
public class LoginToken {
    private String loginTokenKey;
    private Integer loginTokenExpMinutes;
}
