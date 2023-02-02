package com.cloud.blog.consumer.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: LiangKaiXuan
 * @Description: 系统权限管理
 * @ProjectName: cloud-blog
 * @Date: 2023/2/117:46
 * @Version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ManageConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageConsumerApplication.class, args);
    }
}