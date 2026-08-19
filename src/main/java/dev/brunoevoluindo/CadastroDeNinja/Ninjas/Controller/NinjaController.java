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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    //Procurar Ninja por ID (CREATE)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasID(@PathVariable Long id) {
        return ninjaService.listarNinjasID(id);
    }

    //Mostrar todos os Ninjas(READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    //Alterar dados dos Ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public String alterarNinjaPorID() {
        return "Ninja atualizado";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public String deletarNinjaPorID() {
        return "Ninja deletado";
    }


}
