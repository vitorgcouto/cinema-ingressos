package io.github.vitorgcouto.cinemaingresso.repository;

import io.github.vitorgcouto.cinemaingresso.model.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {

}
