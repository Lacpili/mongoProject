package com.esgis.sbmongo.service;

import com.esgis.sbmongo.models.Produit;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author lacpili
 */
public interface ProduitService {
    public Produit saveProduit(Produit c);
    public Optional<Produit> findById(String id);
    public List<Produit> findAll();
    public void deleteProduit(String id);
}
