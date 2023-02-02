package com.cloud.blog.producer.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: LiangKaiXuan
 * @Description: 文章生产者服务
 * @ProjectName: cloud-blog
 * @Date: 2023/1/3116:00
 * @Version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ArticleProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArticleProducerApplication.class, args);
    }
}