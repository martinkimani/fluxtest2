package com.example.demo;

import dev.miku.r2dbc.mysql.MySqlConnectionConfiguration;
import dev.miku.r2dbc.mysql.MySqlConnectionFactory;
import dev.miku.r2dbc.mysql.constant.SslMode;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;

/**
 *
 * @author martin
 */
@Configuration
@Profile("test")
public class BetTestConfiguration extends AbstractR2dbcConfiguration{

    @Primary
    @Bean
    @Override
    public ConnectionFactory connectionFactory() {
        return MySqlConnectionFactory.from(MySqlConnectionConfiguration.builder()
                .host("localhost")
                .port(3306)
                .user(System.getenv("R2DBC_USER"))
                .password(System.getenv("R2DBC_PASS"))
                .sslMode(SslMode.DISABLED)
                .build());
    }
    
}