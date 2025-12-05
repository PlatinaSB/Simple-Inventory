/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory4ia17.Service;

import com.mycompany.inventory4ia17.Model.Model;
import com.mycompany.inventory4ia17.Repository.RepositoryInv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Platina Setia Budi
 */
@Service
public class ServiceInv {

    @Autowired
    private RepositoryInv repository;

    public List<Model> getAllInv() {
        return repository.findAll();
    }

    public Model getInv(int id) {
        return repository.findById(id).orElse(null);
    }

    public void addInv(Model inv) {
        repository.save(inv);
    }

    public void editInv(Model inv) {
        repository.save(inv);
    }

    public void deleteInv(int id) {
        repository.deleteById(id);
    }

}
