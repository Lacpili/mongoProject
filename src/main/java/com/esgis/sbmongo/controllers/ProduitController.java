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
import com.esgis.sbmongo.models.Produit;
import com.esgis.sbmongo.Repository.ProduitRepository;
import com.esgis.sbmongo.service.ProduitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lacpili
 */
@Controller
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private ProduitService produitService;

   @GetMapping(name = "ajouter", value = "/ajouter")
    public ResponseEntity<Produit> createProduit(@RequestBody Produit p) {
        try {
            Produit prod = produitService.saveProduit(p);
                    return  new ResponseEntity<>(prod, HttpStatus.CREATED);
        } catch (Exception e) {
            return  new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
   

    @GetMapping(name = "lister",value = "/lister")
    public ResponseEntity<List<Produit>> getAll() {
        try {
            List<Produit> p = produitService.findAll();
            if(p.isEmpty()){
                return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(p, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
