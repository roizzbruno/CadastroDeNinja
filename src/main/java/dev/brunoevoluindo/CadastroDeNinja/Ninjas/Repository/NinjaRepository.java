package dev.brunoevoluindo.CadastroDeNinja.Ninjas.Repository;

import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
