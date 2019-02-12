/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_fournisseur.service;

import com.express.aliExpress_fournisseur.bean.Review;

/**
 *
 * @author hp pc
 */
public interface ReviewService {

    public int saveReview(Review review);

    public Review findByReference(String refernce);
    
    public Review findByReferenceCommande (String referenceCommande);


}
