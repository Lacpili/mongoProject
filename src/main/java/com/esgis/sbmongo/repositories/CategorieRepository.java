package com.esgis.sbmongo.Repository;

import com.esgis.sbmongo.models.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author lacpili
 */

public interface CategorieRepository extends MongoRepository<Categorie, String> {
}