/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory4ia17.Repository;

import com.mycompany.inventory4ia17.Model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Platina Setia Budi
 */
@Repository
public interface RepositoryInv extends JpaRepository<Model, Integer> {

}
