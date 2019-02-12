/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_fournisseur.service.impl;

import com.express.aliExpress_fournisseur.bean.Pays;
import com.express.aliExpress_fournisseur.dao.PaysDao;
import com.express.aliExpress_fournisseur.service.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp pc
 */
@Service
public class PaysSeviceImpl implements PaysService {
    @Autowired
    PaysDao paysDao;

    @Override
    public Pays findByFournisseurMatricule(String matricule) {
    return paysDao.findByFournisseurMatricule(matricule);
}
}