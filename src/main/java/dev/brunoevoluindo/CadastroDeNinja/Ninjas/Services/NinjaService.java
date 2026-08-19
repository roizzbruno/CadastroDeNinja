package dev.brunoevoluindo.CadastroDeNinja.Ninjas.Services;

import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Model.NinjaModel;
import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    //Injeção da dependência NinjaRepository
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Serviços/Funções
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjasID(Long id){
        Optional<NinjaModel> ninjaID = ninjaRepository.findById(id);
        return ninjaID.orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }


}
