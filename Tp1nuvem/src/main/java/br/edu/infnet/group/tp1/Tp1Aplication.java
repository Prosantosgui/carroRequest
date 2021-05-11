/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.group.tp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Gui
 */@RestController
 @RequestMapping("https://parallelum.com.br/fipe/api/v1")
public class Tp1Aplication {
     @GetMapping("/carros/marcas/59/modelos/5940/anos/2014-3")
     public Carro getCarro(){
     return 
     }
    
}
