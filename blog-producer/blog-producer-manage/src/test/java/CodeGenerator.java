import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Property;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: LiangKaiXuan
 * @Description: mybatis-plus代码生成器
 * @ProjectName: cloud-blog
 * @Date: 2023/2/215:24
 * @Version: V1.0
 */
public class CodeGenerator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("sys_dept");
        list.add("sys_login_log");
        list.add("sys_menu");
        list.add("sys_oper_log");
        list.add("sys_post");
        list.add("sys_role");
        list.add("sys_role_menu");
        list.add("sys_user");
        list.add("sys_user_role");
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/cloud-blog-manage?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8","root"
                ,"lkx123456").globalConfig(builder -> {
            builder.author("lkx")//作者
                    .fileOverride()//覆盖已经存在的文件
                    .outputDir("D:\\private\\cloud-blog\\blog-producer\\blog-producer-manage\\src\\main\\java")//文件生成地址
                    .commentDate("yyyy-MM-dd HH:mm:ss");//时间格式

        }).globalConfig(global->{
            global.dateType(DateType.ONLY_DATE);//时间策略

        }).packageConfig(builder -> {//包设置
            builder.parent("com.cloud.blog.producer")//父类路径设置
                    .moduleName("manage")//模块名称，指定生成在哪个模块
                    .entity("entity")//实体类包名
                    .service("service")//服务类包名
                    .serviceImpl("service.impl")//服务类包名
                    .controller("controller")//controller层包名
                    .mapper("mapper")//dao层包名
                    .xml("mapper")//xml包名
                    .pathInfo(Collections.singletonMap(OutputFile.xml,"D:\\private\\cloud-blog\\blog-producer\\blog-producer-manage\\src\\main\\resources\\mapper"));//xml存放的路径
        }).strategyConfig(builder -> {//设置文件生成名字
            builder.addInclude(list)//需要生成的表名，用逗号隔开，可以多个表生成
                    .addFieldPrefix("")//指定表的哪些字段去掉
                    .serviceBuilder()//开始设置服务层
                    .formatServiceFileName("%sService")//这里整体为 %s（代表表名）+ 后面的Service
                    .formatServiceImplFileName("%sServiceImpl")
                    .entityBuilder()
//                    .enableColumnConstant()//生成字段常量
                    .naming(NamingStrategy.underline_to_camel)//生成符合驼峰命名
                    .enableChainModel()//支持链式书写
                    .enableLombok()//支持lombok
                    .versionColumnName("version")//指定乐观锁的字段名称
                    .addTableFills(new Property("gmtCreate", FieldFill.INSERT))
                    .addTableFills(new Property("gmtModified", FieldFill.INSERT_UPDATE))
                    .logicDeletePropertyName("deleted")//指出逻辑删除
                    .enableTableFieldAnnotation()//提供字段注解
                    .controllerBuilder()
                    .formatFileName("%sController")
                    .enableRestStyle()//生成@restcontroller 风格
                    .mapperBuilder()
                    .superClass(BaseMapper.class)//继承
                    .formatMapperFileName("%sMapper")
                    .enableMapperAnnotation()//开启注解
                    .formatXmlFileName("%sMapper");

        }).templateEngine(new VelocityTemplateEngine()).execute();//以模板的方式生成
    }

}