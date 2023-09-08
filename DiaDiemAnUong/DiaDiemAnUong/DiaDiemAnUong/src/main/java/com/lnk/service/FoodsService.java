/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lnk.service;

import com.lnk.pojo.Foods;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jackie's PC
 */
public interface FoodsService {

    List<Foods> getFoods(Map<String, String> params);
    
    Long countFoods();

    boolean addOrUpdateFoods(Foods f);

    Foods getFoodsById(int id);

    boolean deleteFoods(int id);
}
