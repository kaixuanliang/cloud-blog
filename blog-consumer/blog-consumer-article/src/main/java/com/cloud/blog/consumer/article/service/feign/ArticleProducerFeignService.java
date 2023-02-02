package com.cloud.blog.consumer.article.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: LiangKaiXuan
 * @Description: 文章服务接口
 * @ProjectName: cloud-blog
 * @Date: 2023/1/3116:02
 * @Version: V1.0
 */
@FeignClient(name = "blog-producer-article",path = "/producer/article")
public interface ArticleProducerFeignService {
}
