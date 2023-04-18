package com.Facturation.demo.Configuration;

import com.Facturation.demo.Repository.UtilisateurRepository;
import com.Facturation.demo.Service.UtilisateurService;
import com.Facturation.demo.ServiceImpl.UtilisateurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@ComponentScan
public class UtilisateurConfiguration {

    @Bean
    public UtilisateurService utilisateurService(UtilisateurRepository utilisateurRepository) {
        return new UtilisateurServiceImpl(utilisateurRepository);
    }

}
