package com.Facturation.demo.Configuration;

import com.Facturation.demo.Repository.FactureRepository;
import com.Facturation.demo.Service.FactureService;
import com.Facturation.demo.ServiceImpl.FactureServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactureConfiguration {
    @Bean
    public FactureService factureService(FactureRepository factureRepository) {
        return new FactureServiceImpl(factureRepository);
    }


}
