package com.sam09.lib.cryptographystarter.configuration;

import com.sam09.lib.cryptographystarter.service.CryptoService;
import com.sam09.lib.cryptographystarter.service.CryptoServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(CryptoService.class) //This configuration will only come into the picture when CrypoService is present in the classpath
public class CryptoServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public CryptoService cryptoService(){
        return new CryptoServiceImpl();
    }
}