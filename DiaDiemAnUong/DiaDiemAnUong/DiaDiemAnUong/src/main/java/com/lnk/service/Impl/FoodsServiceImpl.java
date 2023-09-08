/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lnk.service.Impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.lnk.pojo.Foods;
import com.lnk.repository.FoodsRepository;
import com.lnk.service.FoodsService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jackie's PC
 */
@Service
public class FoodsServiceImpl implements FoodsService {

    @Autowired
    private FoodsRepository foodsRepo;
    @Autowired
    private Cloudinary cloudinary;

    @Override
    public List<Foods> getFoods(Map<String, String> params) {
        return this.foodsRepo.getFoods(params);
    }

    @Override
    public Long countFoods() {
        return this.foodsRepo.countFoods();
    }

    @Override
    public boolean addOrUpdateFoods(Foods f) {
        if (!f.getFile().isEmpty()) {
            try {
                Map res = this.cloudinary.uploader().upload(f.getFile().getBytes(), ObjectUtils.asMap("resource_type", "auto"));
                f.setImgfood(res.get("secure_url").toString());
            } catch (IOException ex) {
                Logger.getLogger(FoodsServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.foodsRepo.addOrUpdateFoods(f);
    }

    @Override
    public Foods getFoodsById(int id) {
        return this.foodsRepo.getFoodsById(id);
    }

    @Override
    public boolean deleteFoods(int id) {
        return this.foodsRepo.deleteFoods(id);
    }

}
