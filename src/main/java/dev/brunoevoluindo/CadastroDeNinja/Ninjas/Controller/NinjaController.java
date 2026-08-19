package dev.brunoevoluindo.CadastroDeNinja.Ninjas.Controller;

import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Model.NinjaModel;
import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Services.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota.";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    //Procurar Ninja por ID (CREATE)
    @GetMapping("/listarNinjasID")
    public String mostrarNinjaPorId() {
        return "Lista de Ninjas por ID";
    }

    //Mostrar todos os Ninjas(READ)
    @GetMapping("/listarNinjas")
    public List<NinjaModel> listarNinja() {
        return ninjaService.listarNinjas();
    }

    //Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterarPorID")
    public String alterarNinjaPorID() {
        return "Ninja atualizado";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletarNinjaPorID")
    public String deletarNinjaPorID() {
        return "Ninja deletado";
    }


}
