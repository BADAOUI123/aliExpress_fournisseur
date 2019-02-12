/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_fournisseur.dao;

import com.express.aliExpress_fournisseur.bean.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp pc
 */
@Repository
public interface PaysDao extends JpaRepository<Pays,Long> {
    
    public Pays findByFournisseurMatricule(String matricule);
    
}
