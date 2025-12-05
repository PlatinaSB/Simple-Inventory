/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inventory4ia17;

import com.mycompany.inventory4ia17.Controller.ControllerInv;
import com.mycompany.inventory4ia17.Service.ServiceInv;
import com.mycompany.inventory4ia17.View.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Platina Setia Budi
 */
@SpringBootApplication
public class Inventory4IA17 implements ApplicationRunner {

    @Autowired
    private ServiceInv ServiceInv;

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");

        ApplicationContext context = SpringApplication.run(Inventory4IA17.class, args);

        ControllerInv controller = context.getBean(ControllerInv.class);
        View invView = new View(controller);
        invView.setVisible(true);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
