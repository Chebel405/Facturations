package com.Facturation.demo;

import com.Facturation.demo.Entity.Entreprise;
import com.Facturation.demo.Entity.Facture;
import com.Facturation.demo.Entity.Utilisateur;
import jakarta.transaction.Transaction;
import jakarta.websocket.Session;
import org.hibernate.HibernateException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class EssaiFacturationApplication {

	public static void main(String[] args) {

		SpringApplication.run(EssaiFacturationApplication.class, args);

	}

}
