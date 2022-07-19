package com.esgis.sbmongo.service;

import com.esgis.sbmongo.models.Categorie;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author lacpili
 */
public interface CategorieService {
    public Categorie saveCategorie(Categorie c);
    public Optional<Categorie> findById(String id);
    public List<Categorie> findAll();
    public void deleteCategorie(String id);
}
