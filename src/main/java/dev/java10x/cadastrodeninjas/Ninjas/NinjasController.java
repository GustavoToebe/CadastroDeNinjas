package dev.java10x.cadastrodeninjas.Ninjas;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjasController {

    @GetMapping("/boasvindasninja")
    public String boasVindas() {
        return "Boa vindas ninjas";
    }

    @PostMapping("/criar")
    public String criarNinja() {
        return "Criado com sucesso";
    }

    @GetMapping("/todos")
    public String mostrarNinjas() {
        return "Lista de ninjas";
    }

    @GetMapping("/todosID")
    public String mostrarNinjasById() {
        return "Lista de ninjas por ID";
    }

    @PutMapping("/alteraID")
    public String atualizarNinjasById() {
        return "Atualizado com sucesso";
    }

    @DeleteMapping("/exxluirID")
    public String excluirNinjas() {
        return "Excluido com sucesso";
    }

}
