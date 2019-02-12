/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_fournisseur.service;

import com.express.aliExpress_fournisseur.bean.Fournisseur;
import com.express.aliExpress_fournisseur.bean.Pays;

/**
 *
 * @author hp pc
 */
public interface PaysService {

    public Pays findByFournisseurMatricule(String matricule);

}
