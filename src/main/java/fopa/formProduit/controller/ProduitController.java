package fopa.formProduit.controller;

import fopa.formProduit.produit.ProduitT;
import fopa.formProduit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ProduitController {
    @Autowired
    private ProduitService produitService;


    @RequestMapping(method= RequestMethod.GET,value="/produitTs")
    public List<ProduitT>  getProduitT(){

        return produitService.getProduitTs();
    }
    @RequestMapping(method= RequestMethod.GET,value="/produitT/{id}")
     public ProduitT getProduitT(@PathVariable long id){
        return produitService.getProduitT(id);

     }
     @RequestMapping(method = RequestMethod.DELETE, value = ("/produitT/{id}"))
     public void deleteProduitT (@PathVariable long id){
        produitService.deletePoduitT(id);
     }


     @RequestMapping(method = RequestMethod.POST, value = ("/produitTs"))
     public void addProduitT (@RequestBody ProduitT produitT){
        System.out.println(produitT);
        produitService.addProduitT(produitT);
     }

     @RequestMapping(method = RequestMethod.PUT, value = "/produitT/{id}")
     public void updateProduitT(@RequestBody ProduitT produitT,@PathVariable long id){
        produitService.updateProduitT(produitT, id);
     }



}
