package org.example.core.ioc.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * profile:
 * + usage
 * + default
 * + several profiles
 * + & | !
 * + methods with same name
 */
@Configuration
public class AppConfig {
    @Bean
    public DBConfig dbConfig() {
        return new DBConfig();
    }

    @Bean("devDS")
    @Profile({"development","one"})
    public DataSource devDataSource() {
        return new H2DB();
    }

    @Bean("devDSwithConfig")
    @Profile({"development","two"})
    public DataSource devDataSource(DBConfig config) {
        System.out.println("--- setting up devDataSource with config ---");
        return new H2DB();
    }

    /* -----------------------------------------------------------*/
    @Bean
    @Profile("production & (us-east | eu-central)")
    public DataSource prodDataSource() {
        return new PostgreSQL();
    }

    /* -----------------------------------------------------------*/
    @Bean
    @Profile("asdf")
    public DataSource defaultDataSource() {
        return new DataSource() {
        };
    }
}
