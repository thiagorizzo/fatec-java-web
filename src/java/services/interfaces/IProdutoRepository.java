/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.interfaces;

import domain.Produto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Rizzo
 */
public interface IProdutoRepository {
    List<Produto> getAll();
    
    Produto addProduto(Produto produto);
    
    void removeProduto(Produto produto);
    
    Optional<Produto> getProdutoByCodigo(int id);    
}
