package dev.brunoevoluindo.CadastroDeNinja.Ninjas.Services;

import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Model.NinjaModel;
import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
