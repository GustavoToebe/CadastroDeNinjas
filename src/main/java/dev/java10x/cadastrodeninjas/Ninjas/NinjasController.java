package dev.java10x.cadastrodeninjas.Ninjas;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjasController {

    private NinjaService ninjaService;
    private NinjaMapper ninjaMapper;

    public NinjasController(NinjaService ninjaService, NinjaMapper ninjaMapper) {
        this.ninjaService = ninjaService;
        this.ninjaMapper = ninjaMapper;
    }

    @GetMapping("/boasvindasninja")
    public String boasVindas() {
        return "Boa vindas ninjas";
    }

    @PostMapping("/criarninja")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO NinjaDTO) {
        return ninjaService.addNinja(NinjaDTO);
    }

    @GetMapping("/listarninjas")
    public List<NinjaModel> listarninjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/getNinjaById/{id}")
    public NinjaModel mostrarNinjasById(@PathVariable Integer id) {
        return ninjaService.getNinjaById(id);
    }

    @PutMapping("/atualizarNinjabyid/{id}")
    public NinjaModel atualizarNinjasById(@PathVariable Integer id, @RequestBody NinjaModel ninja) {
        return ninjaService.updateNinja(id, ninja);
    }

    @DeleteMapping("/excluirNinjaById/{id}")
    public String excluirNinjasById(@PathVariable Integer id) {
        ninjaService.deleteNinja(id);
        return "Excluido com sucesso";
    }
}
