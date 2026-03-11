package org.example.kuangstudythymeleaf.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        // [MOD-PAGINATION] Enable MyBatis-Plus pagination plugin.
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        // [MOD-PAGINATION] Limit one page to at most 100 rows.
        paginationInnerInterceptor.setMaxLimit(100L);
        // [MOD-PAGINATION] Overflow page number falls back to first page.
        paginationInnerInterceptor.setOverflow(true);

        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }
}
