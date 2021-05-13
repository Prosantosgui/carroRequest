/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.dev.exemplo2.demo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Gui
 */
@FeignClient(url= "https://parallelum.com.br/fipe/api/v1/", name = "InterfaceCarro")
public interface InterfaceCarro {
    @GetMapping("carros/marcas/59/modelos/5940/anos/2014-3")
    Carro getCarro();
    
}
