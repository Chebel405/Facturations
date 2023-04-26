package com.Facturation.demo.ServiceImpl;

import com.Facturation.demo.Entity.Entreprise;
import com.Facturation.demo.Repository.EntrepriseRepository;
import com.Facturation.demo.Service.EntrepriseService;
import jakarta.transaction.Transactional;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class EntrepriseServiceImpl implements EntrepriseService {

    private final EntrepriseRepository entrepriseRepository;
    @Autowired
    public EntrepriseServiceImpl(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    @Override
    public Entreprise createEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> findAll() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Optional<Entreprise> findById(Long siret) {
        return Optional.ofNullable(entrepriseRepository.findById(siret).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    @Override
    public Entreprise save(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void deleteById(Long siret) {
        entrepriseRepository.deleteById(siret);
    }
    @Override
    public Entreprise updateEntreprise(@PathVariable Long siret, @RequestBody Entreprise entreprise) {
        Optional<Entreprise> optionalClient = entrepriseRepository.findById(siret);
        if (optionalClient.isPresent()) {
            Entreprise existeEntreprise = optionalClient.get();
            existeEntreprise.setSiren(entreprise.getSiren());
            existeEntreprise.setApe(entreprise.getApe());
            existeEntreprise.setTva(entreprise.getTva());
            existeEntreprise.setAdresse(entreprise.getAdresse());
            existeEntreprise.setCodePostal(entreprise.getCodePostal());
            existeEntreprise.setCommune(entreprise.getCommune());
            existeEntreprise.setPortable(entreprise.getPortable());
            existeEntreprise.setRaisonSocial(entreprise.getRaisonSocial());
            existeEntreprise.setSiege(entreprise.getSiege());
            existeEntreprise.setRcs(entreprise.getRcs());
            existeEntreprise.setCfe(entreprise.getCfe());
            existeEntreprise.setCodeActivite(entreprise.getCodeActivite());
            existeEntreprise.setMail(entreprise.getMail());
            existeEntreprise.setSite(entreprise.getSite());
            existeEntreprise.setNote(entreprise.getNote());
            return entrepriseRepository.save(existeEntreprise);
        }
        return entreprise;

        }

   /* @Override
    public Optional<Entreprise> findByIdWithFactures(Long id) {
        Optional<Entreprise> entreprise = entrepriseRepository.findByIdWithFactures(id);
        entreprise.ifPresent(e -> Hibernate.initialize(e.getFactures()));
        return entreprise;
    }*/
   @Transactional
   @Override
   public Optional<Entreprise> findByIdWithFactures(Long siret) {
       Optional<Entreprise> entreprise = entrepriseRepository.findByIdWithFactures(siret);
       entreprise.ifPresent(e -> Hibernate.initialize(e.getFactures()));
       return entreprise;
   }

   /* @Override
    public Optional<Entreprise> findByIdWithFactures(Long siret) {
        return entrepriseRepository.findByIdWithFactures(siret);
    }*/









}
