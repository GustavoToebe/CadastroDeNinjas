package dev.java10x.cadastrodeninjas.Ninjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjasController {

    @GetMapping("/boasvindasninja")
    public String boasVindas() {
        return "Boa vindas ninjas";
    }
}
