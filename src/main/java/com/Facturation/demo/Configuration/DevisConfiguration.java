package com.Facturation.demo.Configuration;

import com.Facturation.demo.Repository.DevisRepository;
import com.Facturation.demo.Repository.FactureRepository;
import com.Facturation.demo.Service.DevisService;
import com.Facturation.demo.Service.FactureService;
import com.Facturation.demo.ServiceImpl.DevisServiceImpl;
import com.Facturation.demo.ServiceImpl.FactureServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevisConfiguration {
    @Bean
    public DevisService devisService(DevisRepository devisRepository) {
        return new DevisServiceImpl(devisRepository);
    }
}
