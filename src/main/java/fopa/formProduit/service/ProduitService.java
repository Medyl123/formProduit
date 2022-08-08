package fopa.formProduit.service;

import fopa.formProduit.produit.ProduitT;
import fopa.formProduit.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public List<ProduitT> getProduitTs (){
//        List<ProduitT> produitTs = new ArrayList<>();
//        produitRepository.findAll().forEach(produitT -> {
//            produitTs.add(produitT);
//        });
//        return produitTs;
        return produitRepository.findAll();
    }
    public ProduitT getProduitT(long id){
        return produitRepository.findById(id).orElse(null);
    }

    public void deletePoduitT(long id) {
        produitRepository.deleteById(id);
    }

    public void addProduitT(ProduitT produitT) {
        produitRepository.save(produitT);
    }

    public void updateProduitT(ProduitT produitT, long id) {
           produitRepository.save(produitT);

    }
}
