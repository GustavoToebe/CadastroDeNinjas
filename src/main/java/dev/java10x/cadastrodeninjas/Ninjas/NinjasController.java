package dev.java10x.cadastrodeninjas.Ninjas;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjasController {

    private NinjaService ninjaService;

    public NinjasController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindasninja")
    public String boasVindas() {
        return "Boa vindas ninjas";
    }

    @PostMapping("/criarninja")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.addNinja(ninja);
    }

    @GetMapping("/listarninjas")
    public List<NinjaModel> listarninjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/getNinjaById/{id}")
    public NinjaModel mostrarNinjasById(@PathVariable Integer id) {
        return ninjaService.getNinjaById(id);
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
