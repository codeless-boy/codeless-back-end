package io.github.codeless.framework.database.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis plus 配置信息
 */
@Configuration
@MapperScan(annotationClass = Mapper.class)
public class MybatisPlusConfig {
    
}
