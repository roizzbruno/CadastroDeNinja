package dev.brunoevoluindo.CadastroDeNinja.Missoes.Repository;

import dev.brunoevoluindo.CadastroDeNinja.Missoes.Model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
