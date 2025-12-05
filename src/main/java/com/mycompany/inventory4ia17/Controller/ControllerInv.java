/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory4ia17.Controller;

import com.mycompany.inventory4ia17.Model.Model;
import com.mycompany.inventory4ia17.Service.ServiceInv;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Platina Setia Budi
 */
@Controller
public class ControllerInv {

    @Autowired
    private ServiceInv ServiceInv;

    public List<Model> getAllInv() {
        return ServiceInv.getAllInv();
    }

    public Model getInv(@PathVariable int id) {
        return ServiceInv.getInv(id);
    }

    public String addInv(@RequestBody Model inv) {
        ServiceInv.addInv(inv);
        return "Inventory added successfully";
    }

    public String updateInv(@RequestBody Model inv) {
        ServiceInv.addInv(inv);
        return "Inventory updated successfully";
    }

    public String deleteInv(@PathVariable int id) {
        ServiceInv.deleteInv(id);
        return "Inventory deleted successfuly";
    }

}
