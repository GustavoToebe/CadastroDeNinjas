package dev.java10x.cadastrodeninjas.Missoes;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criado com sucesso!";
    }

    @PutMapping("/atualizarMissao")
    public String atualizarMissao(){
        return "Missao atualizado com sucesso!";
    }

    @GetMapping("/mostrarTodasAaMissoes")
    public String listarMissoes(){
        return "Lista de missoes";
    }

    @DeleteMapping("/deletarMissao")
    public String deletarMissao(){
        return "Deletado com sucesso!";
    }

}
