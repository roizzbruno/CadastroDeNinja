package dev.brunoevoluindo.CadastroDeNinja.Ninjas.Services;

import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Model.NinjaModel;
import dev.brunoevoluindo.CadastroDeNinja.Ninjas.NinjaDTO;
import dev.brunoevoluindo.CadastroDeNinja.Ninjas.NinjaMapper;
import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    //Injeção da dependência NinjaRepository
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Serviços/Funções

    //Adicionar Ninja (CREATE)
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);

    }

    //Listar todos os Ninjas (READ)
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Listar Ninja por ID (CREATE)
    public NinjaModel listarNinjasID(Long id){
        Optional<NinjaModel> ninjaID = ninjaRepository.findById(id);
        return ninjaID.orElse(null);
    }

    //Deletar Ninja (DELETE)
    public void deletarNinja(Long id){
        ninjaRepository.deleteById(id);
    }

    //Alterar dados dos Ninjas (UPDATE)
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }

}
