/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_fournisseur.service.impl;

import com.express.aliExpress_fournisseur.bean.Fournisseur;
import com.express.aliExpress_fournisseur.dao.FournisseurDao;
import com.express.aliExpress_fournisseur.service.FournisseurService;
import com.express.aliExpress_fournisseur.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp pc
 */
@Service
public class FournisseurServiceImpl implements FournisseurService {

    @Autowired
    private FournisseurDao fournisseurDao;
    @Autowired
    private ReviewService reviewService;

    @Override
    public int saveFournisseur(Fournisseur fournisseur) {
        Fournisseur f = findByReference(fournisseur.getMatricule());
        if (f != null) {
            return -1;
        } else {
            fournisseur.setPays(fournisseur.getPays());
            fournisseur.setMatricule(fournisseur.getMatricule());
            fournisseur.setMotDePasse(fournisseur.getMotDePasse());
            fournisseurDao.save(fournisseur);
            return 1;
        }
    }

    @Override
    public Fournisseur findByReference(String reference) {
        return fournisseurDao.findByReference(reference);
    }

    @Override
    public int seConnecterFournissuer(Fournisseur fournisseur) {
        Fournisseur fourniCharge = new Fournisseur();
        if (fourniCharge.getMatricule() == null) {
            return -1;
        } else if (!fourniCharge.getMotDePasse().equals(fournisseur.getMotDePasse())) {
            return -2;
        } else {
            return 1;
        }

    }

    public FournisseurDao getFournisseurDao() {
        return fournisseurDao;
    }

    public void setFournisseurDao(FournisseurDao fournisseurDao) {
        this.fournisseurDao = fournisseurDao;
    }

    public ReviewService getReviewService() {
        return reviewService;
    }

    public void setReviewService(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

}
