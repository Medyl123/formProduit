package fopa.formProduit.repository;

import fopa.formProduit.produit.ProduitT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepository extends JpaRepository<ProduitT, Long> {
}
