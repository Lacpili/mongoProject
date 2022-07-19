/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egis.sbmongo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.esgis.sbmongo.models.Categorie;
import com.esgis.sbmongo.Repository.CategorieRepository;
import com.esgis.sbmongo.service.CategorieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lacpili
 */
@RestController
@RequestMapping("/api/categories")
public class CategorieController {
    @Autowired
    private CategorieService categoryService;
    @Autowired
    private CategorieRepository categoriRepository;

    @GetMapping(name = "ajouter", value = "/ajouter")
    public ResponseEntity<Categorie> createCateg(@RequestBody Categorie c) {
        try {
            Categorie categ = categoryService.saveCategorie(c);
                    return  new ResponseEntity<>(categ, HttpStatus.CREATED);
        } catch (Exception e) {
            return  new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    

    @GetMapping(name = "lister",value = "/lister")
    public ResponseEntity<List<Categorie>> getAll() {
        try {
            List<Categorie> categories = categoryService.findAll();
            if(categories.isEmpty()){
                return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(categories, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
