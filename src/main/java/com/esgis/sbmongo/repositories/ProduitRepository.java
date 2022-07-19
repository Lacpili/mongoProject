package com.esgis.sbmongo.Repository;

import com.esgis.sbmongo.models.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author lacpili
 */

public interface ProduitRepository extends MongoRepository<Produit, String> {
}
