package com.Facturation.demo.Configuration;

import com.Facturation.demo.Repository.EntrepriseRepository;
import com.Facturation.demo.Service.EntrepriseService;
import com.Facturation.demo.ServiceImpl.EntrepriseServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class EntrepriseConfiguration {

    @Bean
    public EntrepriseService entrepriseService(EntrepriseRepository entrepriseRepository) {
        return new EntrepriseServiceImpl(entrepriseRepository);
    }
}
