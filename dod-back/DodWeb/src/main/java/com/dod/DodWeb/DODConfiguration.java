package com.dod.DodWeb;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.dod.DodData.model")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.dod.DodData.repository"})
@ComponentScan("com.dod.DodService")
public class DODConfiguration {
}
