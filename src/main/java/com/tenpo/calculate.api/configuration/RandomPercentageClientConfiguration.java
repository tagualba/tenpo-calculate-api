package com.tenpo.calculate.api.configuration;

import com.tenpo.calculate.api.client.RandomPercentageClient;
import com.tenpo.calculate.api.client.RandomPercentageRestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomPercentageClientConfiguration {

    @Bean
    public RandomPercentageClient randomPercentageClient(RandomPercentageRestClient randomPercentageRestClient){
        return randomPercentageRestClient;
    }

}
