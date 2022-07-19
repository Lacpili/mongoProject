package com.esgis.sbmongo.service;

import com.esgis.sbmongo.Repository.ProduitRepository;
import com.esgis.sbmongo.models.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author lacpili
 */
@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    private ProduitRepository produitRepository;
    @Override
    public Produit saveProduit(Produit c) {
        return produitRepository.save(c);
    }

    @Override
    public Optional<Produit> findById(String id) {
        return produitRepository.findById(id);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public void deleteProduit(String id) {
        Optional<Produit> data = findById(id);
        if(data.isPresent()){
            produitRepository.deleteById(id);
        }

    }
}
