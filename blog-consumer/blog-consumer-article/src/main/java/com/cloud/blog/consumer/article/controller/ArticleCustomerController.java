package com.cloud.blog.consumer.article.controller;

import com.cloud.blog.consumer.article.service.ArticleCustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: LiangKaiXuan
 * @Description: 文章服务对外暴露接口
 * @ProjectName: cloud-blog
 * @Date: 2023/1/3116:02
 * @Version: V1.0
 */
@RestController
@RequestMapping("/blog/article")
public class ArticleCustomerController {
    @Resource
    private ArticleCustomerService articleCustomerService;

    @GetMapping("/test")
    public String test(){
        System.out.println("测试");
        return "调用成功！";
    }
}