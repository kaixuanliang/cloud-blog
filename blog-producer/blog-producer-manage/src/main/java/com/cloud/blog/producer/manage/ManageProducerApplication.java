package com.cloud.blog.producer.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: LiangKaiXuan
 * @Description: 系统管理
 * @ProjectName: cloud-blog
 * @Date: 2023/2/118:14
 * @Version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ManageProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageProducerApplication.class, args);
    }
}