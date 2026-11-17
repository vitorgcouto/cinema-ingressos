package io.github.vitorgcouto.cinemaingresso.repository;

import io.github.vitorgcouto.cinemaingresso.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    boolean existsByNumero(Integer numero);
}
