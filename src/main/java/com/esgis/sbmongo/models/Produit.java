package com.esgis.sbmongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
/**
 *
 * @author lacpili
 */
@Document("produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    private String id;
    private String nom;
    private String description;
    private Integer quantite;
    private Float pu;
    private Date dateAjout;
    private Categorie categorie;

}
