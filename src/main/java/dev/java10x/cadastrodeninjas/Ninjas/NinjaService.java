package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public NinjaDTO addNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = new NinjaMapper().map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }

    public NinjaModel getNinjaById(Integer id) {
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    public void deleteNinja(Integer id) {
        ninjaRepository.deleteById(id);
    }

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    public NinjaModel updateNinja(Integer id , NinjaModel ninjaAtualizado) {
        Optional<NinjaModel> ninjaBanco = ninjaRepository.findById(id);
        ninjaAtualizado.setId(id);
        return ninjaRepository.save(ninjaAtualizado);
    }
}
