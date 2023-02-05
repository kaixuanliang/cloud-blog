package com.cloud.blog.consumer.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: LiangKaiXuan
 * @Description: 文章消费者服务
 * @ProjectName: cloud-blog
 * @Date: 2023/1/3116:00
 * @Version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
public class ArticleConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArticleConsumerApplication.class, args);
    }
}